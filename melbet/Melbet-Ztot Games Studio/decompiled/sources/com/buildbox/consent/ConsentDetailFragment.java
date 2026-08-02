package com.buildbox.consent;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.adventuretime.superstorm.R;
import com.buildbox.consent.ConsentAdapter;
import java.util.List;

/* loaded from: classes.dex */
public class ConsentDetailFragment extends DialogFragment implements ConsentAdapter.Listener {
    private List<SdkConsentInfo> sdkConsentInfos = ConsentHelper.getSdkConsentInfos();
    private SharedPreferences sharedPreferences;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_consent_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        ((RecyclerView) view.findViewById(R.id.rvConsentDetails)).setAdapter(new ConsentAdapter(this.sdkConsentInfos, this));
        ((TextView) view.findViewById(R.id.buttonCancel)).setOnClickListener(new View.OnClickListener() { // from class: com.buildbox.consent.ConsentDetailFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ConsentDetailFragment.this.dismiss();
            }
        });
        ((Button) view.findViewById(R.id.buttonConfirm)).setOnClickListener(new View.OnClickListener() { // from class: com.buildbox.consent.ConsentDetailFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                for (SdkConsentInfo sdkConsentInfo : ConsentDetailFragment.this.sdkConsentInfos) {
                    ConsentDetailFragment.this.sharedPreferences.edit().putBoolean(ConsentHelper.getConsentKey(sdkConsentInfo.getSdkId()), sdkConsentInfo.getConsent().booleanValue()).commit();
                }
                if (((ConsentActivity) ConsentDetailFragment.this.getActivity()) != null) {
                    ((ConsentActivity) ConsentDetailFragment.this.getActivity()).startPTPlayer();
                }
            }
        });
    }

    @Override // com.buildbox.consent.ConsentAdapter.Listener
    public void toggleConsent(int i, boolean z) {
        this.sdkConsentInfos.get(i).setConsent(Boolean.valueOf(z));
    }

    @Override // com.buildbox.consent.ConsentAdapter.Listener
    public void clickPrivacyPolicy(SdkConsentInfo sdkConsentInfo) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(sdkConsentInfo.getPrivacyPolicyUrl()));
        startActivity(intent);
    }
}
