package com.aiming.mdt.a;

import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0289;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.aiming.mdt.a.ʼʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0128 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static volatile Set<AdBean> f393 = new HashSet();

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static volatile Set<AdBean> f392 = new HashSet();

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m477(Context context, String str, AdBean adBean, boolean z) {
        if (adBean == null || f393.contains(adBean)) {
            return;
        }
        C0289.m980(new RunnableC0022(adBean, str));
        List<String> imptrackers = adBean.getImptrackers();
        if (imptrackers == null || imptrackers.isEmpty()) {
            return;
        }
        if (z) {
            String adUrl = adBean.getAdUrl();
            if (!TextUtils.isEmpty(adUrl)) {
                imptrackers.add(adUrl);
            }
        }
        Iterator<String> it = imptrackers.iterator();
        while (it.hasNext()) {
            C0026.m22().m672(it.next()).m667(60000).m671(30000).m669(true).m670(context);
        }
        f393.add(adBean);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m478(Context context, AdBean adBean) {
        List<String> clktrackers;
        if (adBean == null || f392.contains(adBean) || (clktrackers = adBean.getClktrackers()) == null || clktrackers.isEmpty()) {
            return;
        }
        Iterator<String> it = clktrackers.iterator();
        while (it.hasNext()) {
            C0026.m22().m672(it.next()).m667(60000).m671(30000).m669(true).m670(context);
        }
        f392.add(adBean);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m479(Context context, String str, String str2) {
        try {
            C0131 c0131 = (C0131) C0162.m619().m622("Config", C0131.class);
            if (c0131 == null) {
                return;
            }
            String m491 = c0131.m491();
            if (TextUtils.isEmpty(m491) || TextUtils.isEmpty(str2) || !str2.contains("?")) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m491);
            sb.append("/videotr");
            sb.append(str2.substring(str2.indexOf("?")));
            sb.append("&event=");
            sb.append(str);
            C0026.m22().m672(sb.toString()).m671(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE).m667(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED).m670(context);
        } catch (Exception e) {
            C0282.m972("AdReport", e);
            C0076.m232().m236(e);
        }
    }
}
