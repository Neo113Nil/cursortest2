package com.buildbox.consent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.adventuretime.superstorm.R;
import java.util.List;

/* loaded from: classes.dex */
public class ConsentAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Listener listener;
    private List<SdkConsentInfo> sdkConsentInfos;

    interface Listener {
        void clickPrivacyPolicy(SdkConsentInfo sdkConsentInfo);

        void toggleConsent(int i, boolean z);
    }

    public ConsentAdapter(List<SdkConsentInfo> list, Listener listener) {
        this.sdkConsentInfos = list;
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.consent_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.bind(this.sdkConsentInfos.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sdkConsentInfos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView displayName;
        TextView privacyPolicy;
        Switch toggle;

        MyViewHolder(View view) {
            super(view);
            this.privacyPolicy = (TextView) view.findViewById(R.id.linkPrivacyPolicy);
            this.displayName = (TextView) view.findViewById(R.id.textNetworkName);
            this.toggle = (Switch) view.findViewById(R.id.switchToggle);
        }

        void bind(final SdkConsentInfo sdkConsentInfo) {
            this.displayName.setText(sdkConsentInfo.getDisplayName());
            this.toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.buildbox.consent.ConsentAdapter.MyViewHolder.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ConsentAdapter.this.listener.toggleConsent(MyViewHolder.this.getAdapterPosition(), z);
                }
            });
            this.privacyPolicy.setOnClickListener(new View.OnClickListener() { // from class: com.buildbox.consent.ConsentAdapter.MyViewHolder.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ConsentAdapter.this.listener.clickPrivacyPolicy(sdkConsentInfo);
                }
            });
        }
    }
}
