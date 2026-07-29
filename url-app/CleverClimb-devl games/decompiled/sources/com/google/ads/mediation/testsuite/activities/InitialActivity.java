package com.google.ads.mediation.testsuite.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.b;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.n;
import com.android.volley.s;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.TestSuite;
import com.google.ads.mediation.testsuite.TestSuiteListener;
import com.google.ads.mediation.testsuite.dataobjects.AdUnit;
import com.google.ads.mediation.testsuite.dataobjects.ConfigResponse;
import com.google.ads.mediation.testsuite.dataobjects.Country;
import com.google.ads.mediation.testsuite.dataobjects.Network;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.ads.mediation.testsuite.utils.MediationConfigClient;
import com.google.ads.mediation.testsuite.utils.logging.TestSuiteState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class InitialActivity extends AppCompatActivity {
    private static final int ADUNITLIST_REQUEST_CODE = 1;
    public static final String APPID_EXTRA_KEY = "APPID";
    private static final int NETWORKLIST_REQUEST_CODE = 2;
    private static final int SELECTCOUNTRY_REQUEST_CODE = 3;
    public static final String UPDATEDCONFIGIDS_RETURN_KEY = "UDPATEDCONFIGIDS";
    public static final String UPDATEDCONFIGVALUES_RETURN_KEY = "UDPATEDCONFIGVALUES";
    private List<AdUnit> adUnits;
    private String appID;
    private TextView countryText;
    private boolean didShowDisclaimer;
    private List<Network> networks;
    private TextView progressText;
    private boolean requestedCountry;
    private Button selectCountryButton;
    private Country selectedCountry;
    private Button testByAdUnitButton;
    private Button testByNetworkButton;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_AppCompat_Light);
        setContentView(R.layout.activity_initial);
        this.appID = getIntent().getStringExtra(APPID_EXTRA_KEY);
        if (this.appID == null || this.appID.length() != 38) {
            Log.e(MediationConfigClient.LOG_TAG, "The provided app ID doesn't look valid. Are you sure it's correct?");
            finish();
            return;
        }
        this.selectedCountry = Country.allCountry();
        this.requestedCountry = true;
        this.countryText = (TextView) findViewById(R.id.ia_tv_country);
        this.progressText = (TextView) findViewById(R.id.ia_tv_progress);
        this.selectCountryButton = (Button) findViewById(R.id.ia_btn_selectCountry);
        this.testByAdUnitButton = (Button) findViewById(R.id.ia_btn_testadunit);
        this.testByNetworkButton = (Button) findViewById(R.id.ia_btn_testnetwork);
        this.selectCountryButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InitialActivity.this.showCountrySelection();
            }
        });
        this.testByNetworkButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(InitialActivity.this, (Class<?>) NetworkListActivity.class);
                intent.putParcelableArrayListExtra("ADUNITS", (ArrayList) InitialActivity.this.adUnits);
                intent.putParcelableArrayListExtra(NetworkListActivity.NETWORKS_EXTRA_KEY, (ArrayList) InitialActivity.this.networks);
                InitialActivity.this.startActivityForResult(intent, 2);
            }
        });
        this.testByAdUnitButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(InitialActivity.this, (Class<?>) AdUnitListActivity.class);
                intent.putParcelableArrayListExtra("ADUNITS", (ArrayList) InitialActivity.this.adUnits);
                InitialActivity.this.startActivityForResult(intent, 1);
            }
        });
        updateCountrySelection();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.didShowDisclaimer) {
            showDisclaimer();
        } else {
            updateSettings();
        }
    }

    private void showDisclaimer() {
        this.didShowDisclaimer = true;
        new b.a(this).a("Disclaimer").a(R.string.instructions).a("OK", new DialogInterface.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InitialActivity.this.updateSettings();
            }
        }).b("Cancel", new DialogInterface.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InitialActivity.this.finish();
            }
        }).b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCountrySelection() {
        startActivityForResult(new Intent(this, (Class<?>) CountryListActivity.class), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSettings() {
        this.progressText.setVisibility(0);
        this.progressText.setText("Loading configuration from server...");
        this.testByAdUnitButton.setEnabled(false);
        this.testByNetworkButton.setEnabled(false);
        if (!this.requestedCountry) {
            showCountrySelection();
            return;
        }
        try {
            MediationConfigClient.makeNetworkRequest(this, this.appID, this.selectedCountry != null ? this.selectedCountry.getCode() : null, new n.b<ConfigResponse>() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.6
                @Override // com.android.volley.n.b
                public void onResponse(ConfigResponse configResponse) {
                    InitialActivity.this.networks = configResponse.getNetworks();
                    InitialActivity.this.adUnits = configResponse.getAdUnits();
                    InitialActivity.this.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            InitialActivity.this.progressText.setVisibility(8);
                            InitialActivity.this.testByAdUnitButton.setEnabled(true);
                            InitialActivity.this.testByNetworkButton.setEnabled(true);
                            InitialActivity.this.testByAdUnitButton.setVisibility(0);
                            InitialActivity.this.testByNetworkButton.setVisibility(0);
                        }
                    });
                }
            }, new n.a() { // from class: com.google.ads.mediation.testsuite.activities.InitialActivity.7
                @Override // com.android.volley.n.a
                public void onErrorResponse(s sVar) {
                    InitialActivity.this.progressText.setText("Unable to retrieve configuration from server. :(");
                }
            });
        } catch (IOException unused) {
            this.progressText.setText("Unable to retrieve configuration from server. :(");
        }
    }

    @Override // android.app.Activity
    public void finish() {
        informListenerOfActivityClosing();
        super.finish();
    }

    private void informListenerOfActivityClosing() {
        TestSuiteListener listener = TestSuite.getListener();
        if (listener != null) {
            listener.onTestSuiteDismissed();
        }
    }

    private void updateCountrySelection() {
        if (this.selectedCountry != null) {
            this.countryText.setText("Selected Country: " + this.selectedCountry.getName());
        } else {
            this.countryText.setText("No country selected");
        }
        TestSuiteState.sharedInstance().setCountryCode(this.selectedCountry == null ? null : this.selectedCountry.getCode());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
            case 2:
                ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra(UPDATEDCONFIGIDS_RETURN_KEY);
                ArrayList<Integer> integerArrayListExtra2 = intent.getIntegerArrayListExtra(UPDATEDCONFIGVALUES_RETURN_KEY);
                for (int i3 = 0; i3 < integerArrayListExtra.size(); i3++) {
                    Iterator<AdUnit> it = this.adUnits.iterator();
                    while (it.hasNext()) {
                        for (NetworkConfig networkConfig : it.next().getNetworkConfigs()) {
                            if (networkConfig.getId() == integerArrayListExtra.get(i3).intValue()) {
                                networkConfig.setLastErrorCode(integerArrayListExtra2.get(i3).intValue());
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i2 == -1) {
                    this.selectedCountry = (Country) intent.getParcelableExtra(CountryListActivity.COUNTRY_RETURN_KEY);
                    updateCountrySelection();
                }
                this.requestedCountry = true;
                break;
        }
    }
}
