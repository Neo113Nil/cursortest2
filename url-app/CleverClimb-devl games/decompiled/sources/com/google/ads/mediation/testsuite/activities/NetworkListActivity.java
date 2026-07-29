package com.google.ads.mediation.testsuite.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.adapters.NetworkListRecyclerViewAdapter;
import com.google.ads.mediation.testsuite.dataobjects.AdUnit;
import com.google.ads.mediation.testsuite.dataobjects.Network;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.ads.mediation.testsuite.utils.MediationConfigClient;
import com.google.ads.mediation.testsuite.utils.logging.TestSuiteScreenOrigin;
import com.google.ads.mediation.testsuite.utils.logging.TestSuiteState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class NetworkListActivity extends AppCompatActivity implements NetworkListRecyclerViewAdapter.OnNetworkConfigClickListener {
    public static final String ADUNITS_EXTRA_KEY = "ADUNITS";
    public static final String LASTTESTRESULT_RETURN_KEY = "LASTTESTRESULT";
    public static final String NETWORKS_EXTRA_KEY = "NETWORKS";
    List<AdUnit> adUnits;
    NetworkListRecyclerViewAdapter adapter;
    List<Network> networks;
    RecyclerView recyclerView;
    List<Object> recyclerViewItems;
    ArrayList<Integer> updatedConfigIds;
    ArrayList<Integer> updatedConfigValues;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_AppCompat_Light);
        setContentView(R.layout.activity_ad_unit_list);
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler);
        this.adUnits = getIntent().getParcelableArrayListExtra("ADUNITS");
        this.networks = getIntent().getParcelableArrayListExtra(NETWORKS_EXTRA_KEY);
        this.updatedConfigIds = new ArrayList<>();
        this.updatedConfigValues = new ArrayList<>();
        this.recyclerViewItems = new ArrayList();
        MediationConfigClient.associateConfigs(this.networks, this.adUnits);
        for (Network network : this.networks) {
            if (network.getConfigs().size() > 0) {
                this.recyclerViewItems.add(network);
                this.recyclerViewItems.addAll(network.getConfigs());
            }
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new NetworkListRecyclerViewAdapter(this.recyclerViewItems, this);
        this.recyclerView.setAdapter(this.adapter);
        ((EditText) findViewById(R.id.searchText)).addTextChangedListener(new TextWatcher() { // from class: com.google.ads.mediation.testsuite.activities.NetworkListActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                NetworkListActivity.this.adapter.getFilter().filter(charSequence);
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        TestSuiteState.sharedInstance().setOriginScreen(TestSuiteScreenOrigin.TestByNetwork);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.reset_tests) {
            resetTests();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void resetTests() {
        this.updatedConfigIds.clear();
        this.updatedConfigValues.clear();
        for (Object obj : this.recyclerViewItems) {
            if (obj instanceof NetworkConfig) {
                NetworkConfig networkConfig = (NetworkConfig) obj;
                networkConfig.setLastErrorCode(-1);
                this.updatedConfigIds.add(Integer.valueOf(networkConfig.getId()));
                this.updatedConfigValues.add(-1);
            }
        }
        this.adapter.notifyDataSetChanged();
    }

    @Override // com.google.ads.mediation.testsuite.adapters.NetworkListRecyclerViewAdapter.OnNetworkConfigClickListener
    public void onClick(NetworkConfig networkConfig) {
        Intent intent = new Intent(this, (Class<?>) NetworkDetailActivity.class);
        intent.putExtra(NetworkDetailActivity.NETWORKCONFIG_EXTRA_KEY, networkConfig);
        startActivityForResult(intent, networkConfig.getId());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        int intExtra = intent.getIntExtra("LASTTESTRESULT", Integer.MIN_VALUE);
        if (intExtra != Integer.MIN_VALUE) {
            for (int i3 = 0; i3 < this.recyclerViewItems.size(); i3++) {
                if (!(this.recyclerViewItems.get(i3) instanceof Network)) {
                    NetworkConfig networkConfig = (NetworkConfig) this.recyclerViewItems.get(i3);
                    if (networkConfig.getId() == i) {
                        networkConfig.setLastErrorCode(intExtra);
                        this.updatedConfigIds.add(Integer.valueOf(i));
                        this.updatedConfigValues.add(Integer.valueOf(intExtra));
                        this.adapter.notifyItemChanged(i3);
                        return;
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putIntegerArrayListExtra(InitialActivity.UPDATEDCONFIGIDS_RETURN_KEY, this.updatedConfigIds);
        intent.putIntegerArrayListExtra(InitialActivity.UPDATEDCONFIGVALUES_RETURN_KEY, this.updatedConfigValues);
        setResult(-1, intent);
        finish();
    }
}
