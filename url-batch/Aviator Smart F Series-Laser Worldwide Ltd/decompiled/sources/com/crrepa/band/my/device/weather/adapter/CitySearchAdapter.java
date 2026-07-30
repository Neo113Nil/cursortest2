package com.crrepa.band.my.device.weather.adapter;

import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.CityModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CitySearchAdapter extends BaseQuickAdapter<CityModel, BaseViewHolder> implements Filterable {
    private List<CityModel> items;
    TextView tvNoResult;

    class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            for (CityModel cityModel : CitySearchAdapter.this.items) {
                if (cityModel.getPinyin().startsWith(charSequence.toString()) || cityModel.getName().contains(charSequence)) {
                    arrayList.add(cityModel);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            CitySearchAdapter.this.setSearchResult((ArrayList) filterResults.values);
        }
    }

    public CitySearchAdapter(@Nullable List<CityModel> list, TextView textView) {
        super(R.layout.item_city, list);
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.tvNoResult = textView;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResult(ArrayList<CityModel> arrayList) {
        if (arrayList.size() == 0) {
            this.tvNoResult.setVisibility(0);
        } else {
            this.tvNoResult.setVisibility(4);
        }
        setNewData(arrayList);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, CityModel cityModel) {
        baseViewHolder.setText(R.id.tv_name, cityModel.getName());
    }
}
