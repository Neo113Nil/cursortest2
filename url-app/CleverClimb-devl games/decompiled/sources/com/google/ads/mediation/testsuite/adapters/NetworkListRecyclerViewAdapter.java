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
import com.google.ads.mediation.testsuite.dataobjects.Network;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.ads.mediation.testsuite.utils.UIUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class NetworkListRecyclerViewAdapter<Object> extends RecyclerView.Adapter implements Filterable {
    private static final int NETWORKCONFIG_VIEW_TYPE = 1;
    private static final int NETWORK_VIEW_TYPE = 0;
    private List<Object> filteredItems;
    private final List<Object> items;
    private OnNetworkConfigClickListener listener;

    public interface OnNetworkConfigClickListener {
        void onClick(NetworkConfig networkConfig);
    }

    public NetworkListRecyclerViewAdapter(List<Object> list, OnNetworkConfigClickListener onNetworkConfigClickListener) {
        this.items = list;
        this.filteredItems = list;
        this.listener = onNetworkConfigClickListener;
    }

    public class NetworkConfigViewHolder extends RecyclerView.ViewHolder {
        public TextView adapter;
        public TextView format;
        public TextView manifest;
        public TextView sdk;
        public TextView slotId;
        public TextView testResult;

        NetworkConfigViewHolder(View view) {
            super(view);
            this.sdk = (TextView) view.findViewById(R.id.tv_sdk);
            this.adapter = (TextView) view.findViewById(R.id.tv_adapter);
            this.manifest = (TextView) view.findViewById(R.id.tv_manifest);
            this.testResult = (TextView) view.findViewById(R.id.tv_test);
            this.slotId = (TextView) view.findViewById(R.id.tv_slot_id);
            this.format = (TextView) view.findViewById(R.id.tv_format);
        }
    }

    public class NetworkViewHolder extends RecyclerView.ViewHolder {
        public TextView networkName;

        NetworkViewHolder(View view) {
            super(view);
            this.networkName = (TextView) view.findViewById(R.id.tv_network_name);
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: com.google.ads.mediation.testsuite.adapters.NetworkListRecyclerViewAdapter.1
            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                return null;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (charSequence == null || charSequence.length() <= 0) {
                    NetworkListRecyclerViewAdapter.this.filteredItems = NetworkListRecyclerViewAdapter.this.items;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String lowerCase = charSequence.toString().toLowerCase();
                    boolean z = false;
                    for (Object obj : NetworkListRecyclerViewAdapter.this.items) {
                        if (obj instanceof Network) {
                            Network network = (Network) obj;
                            boolean z2 = network.getName() != null && network.getName().toLowerCase().contains(lowerCase);
                            if (z2) {
                                arrayList.add(obj);
                            } else {
                                Iterator<NetworkConfig> it = network.getConfigs().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (NetworkListRecyclerViewAdapter.this.matches(it.next(), lowerCase)) {
                                        arrayList.add(obj);
                                        break;
                                    }
                                }
                            }
                            z = z2;
                        } else {
                            NetworkConfig networkConfig = (NetworkConfig) obj;
                            if (z || NetworkListRecyclerViewAdapter.this.matches(networkConfig, lowerCase)) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    NetworkListRecyclerViewAdapter.this.filteredItems = arrayList;
                }
                NetworkListRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean matches(NetworkConfig networkConfig, String str) {
        return networkConfig.matches(str) || (networkConfig.getAdUnitId() != null && networkConfig.getAdUnitId().matches(str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.filteredItems.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.filteredItems.get(i) instanceof Network ? 0 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new NetworkConfigViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.networklist_networkconfig, viewGroup, false));
        }
        return new NetworkViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.networklist_network, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 1) {
            NetworkConfigViewHolder networkConfigViewHolder = (NetworkConfigViewHolder) viewHolder;
            final NetworkConfig networkConfig = (NetworkConfig) this.filteredItems.get(i);
            networkConfigViewHolder.format.setText(networkConfig.getAdapter().getFormat());
            networkConfigViewHolder.slotId.setText(networkConfig.getAdUnitId().getTitle());
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
            networkConfigViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.adapters.NetworkListRecyclerViewAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (NetworkListRecyclerViewAdapter.this.listener != null) {
                        NetworkListRecyclerViewAdapter.this.listener.onClick(networkConfig);
                    }
                }
            });
            return;
        }
        ((NetworkViewHolder) viewHolder).networkName.setText(((Network) this.filteredItems.get(i)).getName());
    }
}
