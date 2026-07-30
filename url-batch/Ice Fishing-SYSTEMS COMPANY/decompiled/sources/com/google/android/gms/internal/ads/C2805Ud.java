package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2805Ud extends C2881Yl {

    /* renamed from: A, reason: collision with root package name */
    public final long f28045A;

    /* renamed from: B, reason: collision with root package name */
    public final String f28046B;

    /* renamed from: C, reason: collision with root package name */
    public final String f28047C;

    /* renamed from: w, reason: collision with root package name */
    public final Map f28048w;

    /* renamed from: x, reason: collision with root package name */
    public final Activity f28049x;

    /* renamed from: y, reason: collision with root package name */
    public final String f28050y;

    /* renamed from: z, reason: collision with root package name */
    public final long f28051z;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2805Ud(InterfaceC3858rh interfaceC3858rh, Map map) {
        super(17, interfaceC3858rh, "createCalendarEvent");
        long parseLong;
        String str;
        this.f28048w = map;
        this.f28049x = interfaceC3858rh.h();
        this.f28050y = x("description");
        this.f28046B = x("summary");
        String str2 = (String) map.get("start_ticks");
        long j9 = -1;
        if (str2 != null) {
            try {
                parseLong = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
            this.f28051z = parseLong;
            str = (String) this.f28048w.get("end_ticks");
            if (str != null) {
                try {
                    j9 = Long.parseLong(str);
                } catch (NumberFormatException unused2) {
                }
            }
            this.f28045A = j9;
            this.f28047C = x("location");
        }
        parseLong = -1;
        this.f28051z = parseLong;
        str = (String) this.f28048w.get("end_ticks");
        if (str != null) {
        }
        this.f28045A = j9;
        this.f28047C = x("location");
    }

    public final String x(String str) {
        Map map = this.f28048w;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
