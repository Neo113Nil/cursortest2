package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.hermes.intl.Constants;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import java.util.ArrayList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f372a;
    public final ArrayList b;
    public final o0 c = new o0(this);

    public p0(Context context, ArrayList arrayList) {
        this.b = arrayList;
        this.f372a = context;
    }

    public static ArrayList a(ArrayList arrayList) {
        String c;
        String str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) obj;
            if (!appPresenceDetails.e() && (c = appPresenceDetails.c()) != null) {
                try {
                    str = Uri.parse(c).getQueryParameter("d");
                } catch (Throwable th) {
                    n8.a(th);
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
            arrayList2.addAll(e0.a(arrayList3, "true"));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2.addAll(e0.a(arrayList4, Constants.CASEFIRST_FALSE));
        }
        return arrayList2;
    }
}
