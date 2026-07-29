package com.google.ads.mediation.testsuite.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.adapters.CountryListRecyclerViewAdapter;
import com.google.ads.mediation.testsuite.dataobjects.Country;
import com.google.ads.mediation.testsuite.utils.MediationConfigClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CountryListActivity extends AppCompatActivity {
    public static String COUNTRY_RETURN_KEY = "CountryCode";
    private CountryListRecyclerViewAdapter adapter;
    private List<Country> countryList;
    private OnCountrySelectedListener listener;
    private RecyclerView recyclerView;
    private EditText searchText;

    public interface OnCountrySelectedListener {
        void onCountrySelected(Country country);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_AppCompat_Light);
        try {
            this.countryList = MediationConfigClient.getCountries(this);
        } catch (IOException e) {
            Log.e(MediationConfigClient.LOG_TAG, "Could not fetch countries");
            e.printStackTrace();
            this.countryList = new ArrayList();
        }
        setContentView(R.layout.activity_country_list);
        this.recyclerView = (RecyclerView) findViewById(R.id.list);
        this.searchText = (EditText) findViewById(R.id.searchText);
        this.searchText.addTextChangedListener(new TextWatcher() { // from class: com.google.ads.mediation.testsuite.activities.CountryListActivity.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CountryListActivity.this.adapter.getFilter().filter(charSequence);
            }
        });
        this.adapter = new CountryListRecyclerViewAdapter(this.countryList, new OnCountrySelectedListener() { // from class: com.google.ads.mediation.testsuite.activities.CountryListActivity.2
            @Override // com.google.ads.mediation.testsuite.activities.CountryListActivity.OnCountrySelectedListener
            public void onCountrySelected(Country country) {
                Intent intent = new Intent();
                intent.putExtra(CountryListActivity.COUNTRY_RETURN_KEY, country);
                CountryListActivity.this.setResult(-1, intent);
                CountryListActivity.this.finish();
            }
        });
        this.recyclerView.setAdapter(this.adapter);
    }
}
