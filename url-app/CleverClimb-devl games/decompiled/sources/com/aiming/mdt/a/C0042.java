package com.aiming.mdt.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.aiming.mdt.a.C0067;
import com.aiming.mdt.adt.AdtActivity;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0277;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.facebook.ads.AudienceNetworkActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0042 extends C0277 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m99(Context context, String str, AdBean adBean) {
        try {
            try {
                C0162.m619().m624(adBean.getPkgName(), String.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                C0282.m972("PlacementUtils", th);
                C0076.m232().m236(th);
            }
            if (!adBean.isWebview() && adBean.getSc() == 1) {
                StringBuilder sb = new StringBuilder("market://details?id=");
                sb.append(adBean.getPkgName());
                C0226.m824(context, sb.toString());
                C0285.m979(new RunnableC0149(context, adBean));
                return;
            }
            if (adBean.isWebview() || adBean.getSc() != 1) {
                Intent intent = new Intent(context, (Class<?>) AdtActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("ad", adBean);
                intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, str);
                context.startActivity(intent);
            }
        } catch (Exception e) {
            C0282.m972("AdReport", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m100(AdBean adBean, String str) {
        try {
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
            C0067 c0067 = m942((String) C0162.m619().m622("ImpRecord", String.class));
            if (c0067 == null) {
                c0067 = new C0067();
            }
            Map<String, List<C0067.C0068>> m205 = c0067.m205();
            if (m205 == null) {
                m205 = new HashMap<>();
            }
            String concat = str.trim().concat("_imp");
            List<C0067.C0068> list = m205.get(concat);
            if (list != null && !list.isEmpty()) {
                Iterator<C0067.C0068> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0067.C0068 next = it.next();
                    if (next.m215().equals(adBean.getCampaignId())) {
                        next.m209(str);
                        next.m212(adBean.getCampaignId());
                        next.m218(format);
                        next.m208(next.m214() + 1);
                        next.m216(adBean.getPkgName());
                        next.m211(System.currentTimeMillis());
                        list.add(next);
                        break;
                    }
                }
                m205.put(concat, list);
                c0067.m206(m205);
                C0162.m619().m624("ImpRecord", Uri.encode(m946(c0067)));
            }
            list = new ArrayList<>();
            C0067.C0068 c0068 = new C0067.C0068();
            c0068.m209(str);
            c0068.m212(adBean.getCampaignId());
            c0068.m218(format);
            c0068.m208(c0068.m214() + 1);
            c0068.m216(adBean.getPkgName());
            c0068.m211(System.currentTimeMillis());
            list.add(c0068);
            m205.put(concat, list);
            c0067.m206(m205);
            C0162.m619().m624("ImpRecord", Uri.encode(m946(c0067)));
        } catch (Throwable th) {
            C0282.m972("PlacementUtils", th);
            C0076.m232().m236(th);
        }
    }
}
