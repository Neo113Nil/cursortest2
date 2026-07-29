package com.google.ads.mediation.testsuite.utils;

import android.content.Context;
import android.util.Log;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.toolbox.j;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.dataobjects.AdUnit;
import com.google.ads.mediation.testsuite.dataobjects.AdUnitResponse;
import com.google.ads.mediation.testsuite.dataobjects.CLDResponse;
import com.google.ads.mediation.testsuite.dataobjects.ConfigResponse;
import com.google.ads.mediation.testsuite.dataobjects.Country;
import com.google.ads.mediation.testsuite.dataobjects.Network;
import com.google.ads.mediation.testsuite.dataobjects.NetworkAdapter;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.gson.b.a;
import com.google.gson.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationConfigClient {
    private static final String ADAPTER_FILE_PATH = "adapters.json";
    private static final String COUNTRIES_FILE_PATH = "countries.json";
    public static final String LOG_TAG = "GMATEST";
    private static final String NETWORK_FILE_PATH = "networks.json";

    public static void makeNetworkRequest(final Context context, String str, String str2, final n.b<ConfigResponse> bVar, n.a aVar) throws IOException {
        String format = String.format(Locale.getDefault(), context.getString(R.string.cld_url), str.substring(0, 27), str.substring(28));
        if (str2 != null && str2.length() > 0) {
            format = format + "&gl=" + str2;
        }
        String str3 = format;
        m a2 = com.android.volley.toolbox.n.a(context);
        final List<Network> networks = getNetworks(context);
        final List<NetworkAdapter> adapters = getAdapters(context, networks);
        a2.a(new j(0, str3, null, new n.b<JSONObject>() { // from class: com.google.ads.mediation.testsuite.utils.MediationConfigClient.1
            @Override // com.android.volley.n.b
            public void onResponse(JSONObject jSONObject) {
                List<AdUnit> adUnitsFromCldJson = MediationConfigClient.getAdUnitsFromCldJson(jSONObject, adapters);
                MediationConfigClient.checkNetworksAndAdUnits(context, networks, adUnitsFromCldJson);
                bVar.onResponse(new ConfigResponse(adUnitsFromCldJson, networks));
            }
        }, aVar));
    }

    public static List<AdUnit> getAdUnitsFromCldJson(JSONObject jSONObject, List<NetworkAdapter> list) {
        ArrayList arrayList = new ArrayList();
        e eVar = new e();
        Type type = new a<CLDResponse>() { // from class: com.google.ads.mediation.testsuite.utils.MediationConfigClient.2
        }.getType();
        Log.d(LOG_TAG, jSONObject.toString());
        CLDResponse cLDResponse = (CLDResponse) eVar.a(jSONObject.toString(), type);
        if (cLDResponse == null) {
            return null;
        }
        int i = 1;
        Iterator<AdUnitResponse> it = cLDResponse.getAdUnitSettings().iterator();
        while (it.hasNext()) {
            AdUnit adUnit = new AdUnit(i, it.next(), list);
            if (adUnit.getNetworkConfigs().size() > 0) {
                arrayList.add(adUnit);
            }
            i += adUnit.getNetworkConfigs().size();
        }
        return arrayList;
    }

    public static List<Network> getNetworks(Context context) throws IOException {
        return (List) new e().a(getStringFromFile(context, NETWORK_FILE_PATH), new a<List<Network>>() { // from class: com.google.ads.mediation.testsuite.utils.MediationConfigClient.3
        }.getType());
    }

    public static List<NetworkAdapter> getAdapters(Context context, List<Network> list) throws IOException {
        List<NetworkAdapter> list2 = (List) new e().a(getStringFromFile(context, ADAPTER_FILE_PATH), new a<List<NetworkAdapter>>() { // from class: com.google.ads.mediation.testsuite.utils.MediationConfigClient.4
        }.getType());
        for (Network network : list) {
            for (NetworkAdapter networkAdapter : list2) {
                if (networkAdapter.getNetworkLabel().equals(network.getName())) {
                    networkAdapter.setNetwork(network);
                }
            }
        }
        return list2;
    }

    public static List<Country> getCountries(Context context) throws IOException {
        return (List) new e().a(getStringFromFile(context, COUNTRIES_FILE_PATH), new a<List<Country>>() { // from class: com.google.ads.mediation.testsuite.utils.MediationConfigClient.5
        }.getType());
    }

    private static String getStringFromFile(Context context, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream open = context.getAssets().open(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                open.close();
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static void checkNetworksAndAdUnits(Context context, List<Network> list, List<AdUnit> list2) {
        AppInfoUtil.init(context);
        Iterator<Network> it = list.iterator();
        while (it.hasNext()) {
            it.next().detectInstallation();
        }
        for (AdUnit adUnit : list2) {
            for (NetworkConfig networkConfig : adUnit.getNetworkConfigs()) {
                networkConfig.getAdapter().detectInstallation();
                int indexOf = list.indexOf(networkConfig.getAdapter().getNetwork());
                if (indexOf >= 0) {
                    list.get(indexOf).addConfig(networkConfig);
                }
                networkConfig.setAdUnit(adUnit);
            }
        }
    }

    public static void associateConfigs(List<Network> list, List<AdUnit> list2) {
        for (AdUnit adUnit : list2) {
            for (NetworkConfig networkConfig : adUnit.getNetworkConfigs()) {
                int indexOf = list.indexOf(networkConfig.getAdapter().getNetwork());
                if (indexOf >= 0) {
                    list.get(indexOf).addConfig(networkConfig);
                }
                networkConfig.setAdUnit(adUnit);
            }
        }
    }
}
