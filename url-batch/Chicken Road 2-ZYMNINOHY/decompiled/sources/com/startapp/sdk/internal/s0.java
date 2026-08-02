package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7544a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7545b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f7546c = new r0(this);

    public s0(Context context, ArrayList arrayList) {
        this.f7545b = arrayList;
        this.f7544a = context;
    }

    public static ArrayList a(ArrayList arrayList) {
        String c4;
        String str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) obj;
            if (!appPresenceDetails.e() && (c4 = appPresenceDetails.c()) != null) {
                try {
                    str = Uri.parse(c4).getQueryParameter("d");
                } catch (Throwable th) {
                    d9.a(th);
                    str = null;
                }
                if (str != null) {
                    if (appPresenceDetails.d()) {
                        arrayList3.add("d=".concat(str));
                    } else {
                        arrayList4.add("d=".concat(str));
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(g0.a(arrayList3, "true"));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2.addAll(g0.a(arrayList4, "false"));
        }
        return arrayList2;
    }
}
