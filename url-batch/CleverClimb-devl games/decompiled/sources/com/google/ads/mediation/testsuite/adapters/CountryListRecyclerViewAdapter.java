package com.google.ads.mediation.testsuite.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.activities.CountryListActivity;
import com.google.ads.mediation.testsuite.dataobjects.Country;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CountryListRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {
    private List<Country> filteredValues;
    private final CountryListActivity.OnCountrySelectedListener listener;
    private final List<Country> values;

    public CountryListRecyclerViewAdapter(List<Country> list, CountryListActivity.OnCountrySelectedListener onCountrySelectedListener) {
        this.values = list;
        this.filteredValues = list;
        this.listener = onCountrySelectedListener;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_country, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        viewHolder.mItem = this.filteredValues.get(i);
        viewHolder.mContentView.setText(this.filteredValues.get(i).getName());
        viewHolder.mView.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.adapters.CountryListRecyclerViewAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CountryListRecyclerViewAdapter.this.listener != null) {
                    CountryListRecyclerViewAdapter.this.listener.onCountrySelected(viewHolder.mItem);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.filteredValues.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: com.google.ads.mediation.testsuite.adapters.CountryListRecyclerViewAdapter.2
            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                return null;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (charSequence == null || charSequence.length() <= 0) {
                    CountryListRecyclerViewAdapter.this.filteredValues = CountryListRecyclerViewAdapter.this.values;
                } else {
                    String lowerCase = charSequence.toString().toLowerCase();
                    ArrayList arrayList = new ArrayList();
                    for (Country country : CountryListRecyclerViewAdapter.this.values) {
                        if (country.getName().toLowerCase().contains(lowerCase)) {
                            arrayList.add(country);
                        }
                    }
                    CountryListRecyclerViewAdapter.this.filteredValues = arrayList;
                }
                CountryListRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mContentView;
        public Country mItem;
        public final View mView;

        public ViewHolder(View view) {
            super(view);
            this.mView = view;
            this.mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override // android.support.v7.widget.RecyclerView.ViewHolder
        public String toString() {
            return super.toString() + " '" + ((Object) this.mContentView.getText()) + "'";
        }
    }
}
