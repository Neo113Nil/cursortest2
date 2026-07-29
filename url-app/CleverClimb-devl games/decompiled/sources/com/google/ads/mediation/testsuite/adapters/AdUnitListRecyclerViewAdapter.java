package com.google.ads.mediation.testsuite.adapters;

import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.dataobjects.AdUnit;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.ads.mediation.testsuite.utils.UIUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AdUnitListRecyclerViewAdapter extends RecyclerView.Adapter implements Filterable {
    private static final int ADUNIT_VIEW_TYPE = 1;
    private static final int NETWORKCONFIG_VIEW_TYPE = 0;
    private List<Object> filteredItems;
    private final List<Object> items;
    private OnNetworkConfigClickListener listener;

    public interface OnNetworkConfigClickListener {
        void onClick(NetworkConfig networkConfig);
    }

    public AdUnitListRecyclerViewAdapter(List<Object> list, OnNetworkConfigClickListener onNetworkConfigClickListener) {
        this.items = list;
        this.filteredItems = list;
        this.listener = onNetworkConfigClickListener;
    }

    public class NetworkConfigViewHolder extends RecyclerView.ViewHolder {
        public TextView adapter;
        public TextView manifest;
        public TextView networkName;
        public TextView sdk;
        public TextView testResult;

        NetworkConfigViewHolder(View view) {
            super(view);
            this.sdk = (TextView) view.findViewById(R.id.tv_sdk);
            this.adapter = (TextView) view.findViewById(R.id.tv_adapter);
            this.manifest = (TextView) view.findViewById(R.id.tv_manifest);
            this.testResult = (TextView) view.findViewById(R.id.tv_test);
            this.networkName = (TextView) view.findViewById(R.id.tv_network_name);
        }
    }

    public class AdUnitIdViewHolder extends RecyclerView.ViewHolder {
        public TextView format;
        public TextView id;
        public TextView mediationGroup;

        AdUnitIdViewHolder(View view) {
            super(view);
            this.id = (TextView) view.findViewById(R.id.tv_id);
            this.format = (TextView) view.findViewById(R.id.tv_format);
            this.mediationGroup = (TextView) view.findViewById(R.id.tv_mediation_group);
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: com.google.ads.mediation.testsuite.adapters.AdUnitListRecyclerViewAdapter.1
            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                return null;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                boolean z;
                if (charSequence == null || charSequence.length() <= 0) {
                    AdUnitListRecyclerViewAdapter.this.filteredItems = AdUnitListRecyclerViewAdapter.this.items;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String lowerCase = charSequence.toString().toLowerCase();
                    boolean z2 = false;
                    for (Object obj : AdUnitListRecyclerViewAdapter.this.items) {
                        if (obj instanceof AdUnit) {
                            AdUnit adUnit = (AdUnit) obj;
                            boolean matches = adUnit.matches(lowerCase);
                            if (matches) {
                                arrayList.add(obj);
                            } else {
                                Iterator<NetworkConfig> it = adUnit.getNetworkConfigs().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().matches(lowerCase)) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    arrayList.add(obj);
                                }
                            }
                            z2 = matches;
                        } else {
                            NetworkConfig networkConfig = (NetworkConfig) obj;
                            if (z2 || networkConfig.matches(lowerCase)) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    AdUnitListRecyclerViewAdapter.this.filteredItems = arrayList;
                }
                AdUnitListRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        };
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.filteredItems.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.filteredItems.get(i) instanceof AdUnit ? 1 : 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new AdUnitIdViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adunitlist_adunitid, viewGroup, false));
        }
        return new NetworkConfigViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adunitlist_networkconfig, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 1) {
            AdUnitIdViewHolder adUnitIdViewHolder = (AdUnitIdViewHolder) viewHolder;
            AdUnit adUnit = (AdUnit) this.filteredItems.get(i);
            adUnitIdViewHolder.id.setText(adUnit.getTitle());
            adUnitIdViewHolder.format.setText(adUnit.getFormat());
            if (adUnit.getMediationGroup() != null) {
                adUnitIdViewHolder.mediationGroup.setVisibility(0);
                adUnitIdViewHolder.mediationGroup.setText(adUnit.getMediationGroup());
                return;
            } else {
                adUnitIdViewHolder.mediationGroup.setVisibility(8);
                return;
            }
        }
        NetworkConfigViewHolder networkConfigViewHolder = (NetworkConfigViewHolder) viewHolder;
        final NetworkConfig networkConfig = (NetworkConfig) this.filteredItems.get(i);
        networkConfigViewHolder.networkName.setText(networkConfig.getAdapter().getNetworkLabel());
        TextView textView = networkConfigViewHolder.adapter;
        boolean isAdapterPresent = networkConfig.getAdapter().isAdapterPresent();
        int i2 = UIUtils.FAIL_COLOR;
        textView.setBackgroundColor(isAdapterPresent ? UIUtils.OK_COLOR : UIUtils.FAIL_COLOR);
        Pair<String, Integer> testStateDescriptors = UIUtils.getTestStateDescriptors(networkConfig);
        networkConfigViewHolder.testResult.setText(testStateDescriptors.first);
        networkConfigViewHolder.testResult.setBackgroundColor(testStateDescriptors.second.intValue());
        if (networkConfig.getAdapter().getNetwork() != null) {
            networkConfigViewHolder.sdk.setBackgroundColor(networkConfig.getAdapter().getNetwork().isSdkPresent() ? UIUtils.OK_COLOR : UIUtils.FAIL_COLOR);
            TextView textView2 = networkConfigViewHolder.manifest;
            if (networkConfig.getAdapter().getNetwork().isManifestPresent()) {
                i2 = UIUtils.OK_COLOR;
            }
            textView2.setBackgroundColor(i2);
        } else {
            networkConfigViewHolder.sdk.setBackgroundColor(0);
            networkConfigViewHolder.manifest.setBackgroundColor(0);
        }
        networkConfigViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.adapters.AdUnitListRecyclerViewAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AdUnitListRecyclerViewAdapter.this.listener != null) {
                    AdUnitListRecyclerViewAdapter.this.listener.onClick(networkConfig);
                }
            }
        });
    }
}
