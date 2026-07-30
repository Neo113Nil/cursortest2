package com.crrepa.band.my.device.worldclock.adapter;

import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.WorldClockModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SearchClockAdapter extends BaseQuickAdapter<WorldClockModel, BaseViewHolder> implements Filterable {
    private List<WorldClockModel> items;
    TextView tvNoResult;

    class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            for (WorldClockModel worldClockModel : SearchClockAdapter.this.items) {
                if (worldClockModel.getPinyin().startsWith(charSequence.toString()) || worldClockModel.getCity().contains(charSequence)) {
                    arrayList.add(worldClockModel);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            SearchClockAdapter.this.setSearchResult((ArrayList) filterResults.values);
        }
    }

    public SearchClockAdapter(@Nullable List<WorldClockModel> list, TextView textView) {
        super(R.layout.item_city, list);
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.tvNoResult = textView;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResult(ArrayList<WorldClockModel> arrayList) {
        if (arrayList.size() == 0) {
            this.tvNoResult.setVisibility(0);
        } else {
            this.tvNoResult.setVisibility(8);
        }
        setNewData(arrayList);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, WorldClockModel worldClockModel) {
        baseViewHolder.setText(R.id.tv_name, worldClockModel.getCity());
        baseViewHolder.setTextColor(R.id.tv_name, ContextCompat.getColor(getContext(), R.color.black));
    }
}
