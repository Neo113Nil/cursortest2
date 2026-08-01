package com.bytedance.sdk.openadsdk.icD.pvs;

/* compiled from: ADEventMonitor.java */
/* loaded from: classes2.dex */
public class pvs {
    public static final icD pvs = new icD(0);
    public static final icD icD = new icD(1);
    public static final icD vG = new icD(2);
    public static final icD Jd = new icD(0);
    public static final icD NB = new icD(1);
    public static final icD sUS = new icD(2);

    public static void pvs(icD icd, boolean z, int i, long j) {
        try {
            icd.yiw.getAndSet(true);
            if (z) {
                icd.pvs.incrementAndGet();
                icd.vG.addAndGet(j);
                return;
            }
            icd.icD.incrementAndGet();
            Integer num = icd.sUS.get(Integer.valueOf(i));
            if (num != null) {
                icd.sUS.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            } else {
                icd.sUS.put(Integer.valueOf(i), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(icD icd, boolean z) {
        try {
            icd.yiw.getAndSet(true);
            if (z) {
                icd.pvs.incrementAndGet();
            } else {
                icd.icD.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(icD icd) {
        try {
            icd.yiw.getAndSet(true);
            icd.NB.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void pvs() {
        try {
            icD icd = pvs;
            if (icd.yiw.get()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", icd.pvs().toString());
            }
            icD icd2 = icD;
            if (icd2.yiw.get()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_net_state", "tt_sdk_event_net_state", icd2.pvs().toString());
            }
            icD icd3 = vG;
            if (icd3.yiw.get()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", icd3.pvs().toString());
            }
            icD icd4 = Jd;
            if (icd4.yiw.get()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", icd4.icD().toString());
            }
            icD icd5 = NB;
            if (icd5.yiw.get()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_db_state", "tt_sdk_event_db_state", icd5.icD().toString());
            }
            icD icd6 = sUS;
            if (icd6.yiw.get()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", icd6.icD().toString());
            }
        } catch (Throwable unused) {
        }
    }

    public static void icD() {
        try {
            com.bytedance.sdk.openadsdk.Wyp.vG.icD("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.Wyp.vG.icD("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.Wyp.vG.icD("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.Wyp.vG.icD("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.Wyp.vG.icD("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.Wyp.vG.icD("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }
}
