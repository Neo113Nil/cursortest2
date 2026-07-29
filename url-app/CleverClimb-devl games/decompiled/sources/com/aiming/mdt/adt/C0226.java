package com.aiming.mdt.adt;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0079;
import com.aiming.mdt.a.C0110;
import com.aiming.mdt.a.C0137;
import com.aiming.mdt.a.C0162;
import com.aiming.mdt.a.ViewOnAttachStateChangeListenerC0159;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0289;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.Constants;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;

/* renamed from: com.aiming.mdt.adt.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0226 {

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static Application f732;

    /* renamed from: ʻ, reason: contains not printable characters */
    private Context f733;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f734;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private InterfaceC0227 f735;

    /* renamed from: ʼ, reason: contains not printable characters */
    private AdBean f736;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private boolean f737;

    /* renamed from: ʽ, reason: contains not printable characters */
    private String f738;

    /* renamed from: com.aiming.mdt.adt.ʻ$ʻ, reason: contains not printable characters */
    public interface InterfaceC0227 {
        /* renamed from: ʻʼ, reason: contains not printable characters */
        void mo846(String str);

        /* renamed from: ʽ */
        void mo15(AdBean adBean);
    }

    C0226(String str, int i, InterfaceC0227 interfaceC0227) {
        this.f738 = str;
        this.f734 = i;
        this.f735 = interfaceC0227;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Intent m819(String str) {
        try {
            int indexOf = str.indexOf("%23Intent&");
            if (indexOf != -1) {
                String substring = str.substring(0, indexOf);
                String replace = str.substring(indexOf + 3).replace('&', ';');
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append('#');
                sb.append(replace);
                str = sb.toString();
            }
            return Intent.parseUri(str, 1);
        } catch (Exception e) {
            C0282.m972("GpUtil", e);
            C0076.m232().m236(e);
            return null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m820(Context context) {
        ViewOnAttachStateChangeListenerC0159.m599().m605(context);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static void m822(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
            outputStream.flush();
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static boolean m823(Context context) {
        return TextUtils.equals(PreferenceManager.getDefaultSharedPreferences(context).getString("IABConsent_SubjectToGDPR", "-1"), "1");
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static boolean m824(Context context, String str) {
        Intent intent;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (!str.startsWith("intent://")) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(parse);
                    intent2.setFlags(268435456);
                    intent2.setPackage("com.android.vending");
                    if (intent2.resolveActivity(context.getPackageManager()) == null) {
                        return false;
                    }
                    context.startActivity(intent2);
                    return true;
                }
                try {
                    intent = m819(str);
                    if (intent != null) {
                        try {
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                            return true;
                        } catch (ActivityNotFoundException e) {
                            e = e;
                            C0282.m972("GpUtil", e);
                            C0076.m232().m236(e);
                            if (intent != null && intent.getExtras() != null) {
                                String string = intent.getExtras().getString("market_referrer");
                                StringBuilder sb = new StringBuilder("market://details?id=");
                                sb.append(intent.getPackage());
                                sb.append("&referrer=");
                                sb.append(string);
                                String obj = sb.toString();
                                Intent intent3 = new Intent("android.intent.action.VIEW");
                                intent3.setData(Uri.parse(obj));
                                intent3.setFlags(268435456);
                                intent3.setPackage("com.android.vending");
                                if (intent3.resolveActivity(context.getPackageManager()) == null) {
                                    return false;
                                }
                                context.startActivity(intent3);
                                return true;
                            }
                            return false;
                        }
                    }
                } catch (ActivityNotFoundException e2) {
                    e = e2;
                    intent = null;
                }
            } catch (Exception e3) {
                C0282.m972("GpUtil", e3);
                C0076.m232().m236(e3);
            }
        }
        return false;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static boolean m825(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String scheme = parse.getScheme();
            String str2 = null;
            String lowerCase = scheme == null ? null : scheme.toLowerCase();
            String host = parse.getHost();
            if (host != null) {
                str2 = host.toLowerCase();
            }
            if ("market".equals(lowerCase) || Constants.INTENT_SCHEME.equals(lowerCase) || "play.google.com".equals(str2)) {
                return true;
            }
            return "mobile.gmarket.co.kr".equals(str2);
        } catch (Exception e) {
            C0282.m972("GpUtil", e);
            C0076.m232().m236(e);
            return false;
        }
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public static C0110 m826() {
        C0110 c0110 = new C0110();
        c0110.m415("User-Agent", (String) C0162.m619().m622("UserAgent", String.class));
        c0110.m415(com.aiming.mdt.utils.Constants.KEY_CONTENT_TYPE, com.aiming.mdt.utils.Constants.CONTENT_TYPE_STREAM);
        return c0110;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Application m829() {
        if (f732 != null) {
            return f732;
        }
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            C0282.m972("getApplication error", e);
            try {
                return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e2) {
                C0282.m972("getApplication error", e2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼ, reason: contains not printable characters */
    public void m831(String str) {
        this.f736 = null;
        if (this.f735 == null) {
            throw new IllegalArgumentException(str);
        }
        this.f735.mo846(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʾ, reason: contains not printable characters */
    public void m832() {
        if (TextUtils.isEmpty(this.f738) || this.f736 == null) {
            return;
        }
        C0162.m619().m621(this.f738, this.f736.getPkgName());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Object m834(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Exception e) {
            C0282.m970("Find Class Error:", e);
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m835(Context context) {
        Application application = (Application) context.getApplicationContext();
        f732 = application;
        C0282.m968((Context) application, false);
        C0076.m232().m234();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m836(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m837(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                try {
                    fileOutputStream2.close();
                } catch (Exception e) {
                    C0282.m972("IOUtil", e);
                    C0076.m232().m236(e);
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null && fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        C0282.m972("IOUtil", e2);
                        C0076.m232().m236(e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static byte[] m838(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m822(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static byte[] m839(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m840() {
        this.f737 = false;
        this.f736 = null;
        if (TextUtils.isEmpty(this.f738)) {
            return;
        }
        C0162.m619().m625(this.f738);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final AdBean m841() {
        return this.f736;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final boolean m842() {
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f738);
        sb.append("refresh");
        if (m619.m623(sb.toString())) {
            C0162 m6192 = C0162.m619();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f738);
            sb2.append("refresh");
            if (((Boolean) m6192.m622(sb2.toString(), Boolean.class)).booleanValue()) {
                this.f736 = null;
                C0162 m6193 = C0162.m619();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f738);
                sb3.append("refresh");
                m6193.m625(sb3.toString());
                return false;
            }
        }
        return (this.f737 || this.f736 == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m843(Context context) {
        String iconUrl;
        if (context == null) {
            m831("Context error");
        }
        if (TextUtils.isEmpty(this.f738)) {
            m831("Placement id is empty");
            return;
        }
        if (!C0079.m244(context)) {
            m831("Network is not available,please check network");
            return;
        }
        this.f733 = context.getApplicationContext();
        if (!TextUtils.isEmpty(this.f738)) {
            C0162.m619().m625(this.f738);
        }
        this.f737 = false;
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f738);
        sb.append("-campaigns");
        JSONArray jSONArray = (JSONArray) m619.m622(sb.toString(), JSONArray.class);
        if (jSONArray == null || jSONArray.length() == 0) {
            m831("No Fill");
            return;
        }
        this.f736 = C0137.m520(jSONArray);
        if (this.f736 == null) {
            m831("No Fill");
            return;
        }
        StringBuilder sb2 = new StringBuilder("adt campaignId: ");
        sb2.append(this.f736.getCampaignId());
        sb2.append(" creativeId : ");
        sb2.append(this.f736.getCid());
        C0282.m971(sb2.toString());
        ArrayList arrayList = new ArrayList();
        int i = this.f734;
        switch (i) {
            case 0:
            case 1:
                iconUrl = this.f736.getIconUrl();
                arrayList.add(iconUrl);
                arrayList.add(this.f736.getMainimgUrl());
                if (this.f734 == 3) {
                    this.f735.mo15(this.f736);
                    m832();
                }
                C0289.m980(new RunnableC0228(this, arrayList, i));
                break;
            case 2:
            case 4:
                if (this.f736.getResources() == null) {
                    m831("Ad resource is empty");
                    break;
                } else {
                    arrayList.addAll(this.f736.getResources());
                    arrayList.add(this.f736.getIconUrl());
                    iconUrl = this.f736.getVideoUrl();
                    arrayList.add(iconUrl);
                    arrayList.add(this.f736.getMainimgUrl());
                    if (this.f734 == 3) {
                    }
                    C0289.m980(new RunnableC0228(this, arrayList, i));
                    break;
                }
                break;
            case 3:
                if (this.f736.getResources() != null) {
                    arrayList.addAll(this.f736.getResources());
                }
            default:
                if (this.f734 == 3) {
                }
                C0289.m980(new RunnableC0228(this, arrayList, i));
                break;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m844(Context context, Class cls, String str) {
        if (m842()) {
            Intent intent = new Intent(context, (Class<?>) cls);
            Bundle bundle = new Bundle();
            bundle.putParcelable("ad", this.f736);
            intent.putExtra(TJAdUnitConstants.String.BUNDLE, bundle);
            intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, str);
            intent.setFlags(268435456);
            context.startActivity(intent);
            m845();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m845() {
        C0162 m619 = C0162.m619();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f738);
        sb.append("-campaigns");
        m619.m625(sb.toString());
        this.f737 = true;
    }
}
