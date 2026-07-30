package t;

import android.util.Log;
import f0.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f1158f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1159g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1160h;

    /* renamed from: i, reason: collision with root package name */
    public final i f1161i;

    public f(Object obj, String str, a aVar, int i2) {
        Collection collection;
        obj.getClass();
        if (i2 == 0) {
            throw null;
        }
        this.f1158f = obj;
        this.f1159g = str;
        this.f1160h = i2;
        i iVar = new i(str + " value: " + obj);
        StackTraceElement[] stackTrace = iVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            l.d("Requested element count ", length, " is less than zero.");
            throw null;
        }
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        collection = new ArrayList(new u0.a(stackTrace, false));
                    } else {
                        collection = Collections.singletonList(stackTrace[0]);
                        collection.getClass();
                    }
                }
            } else if (length == 1) {
                collection = Collections.singletonList(stackTrace[length2 - 1]);
                collection.getClass();
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
            iVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.f1161i = iVar;
        }
        collection = u0.l.f1186b;
        iVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f1161i = iVar;
    }

    @Override // a.a
    public final Object g() {
        int a2 = o.d.a(this.f1160h);
        if (a2 == 0) {
            throw this.f1161i;
        }
        if (a2 != 1) {
            if (a2 == 2) {
                return null;
            }
            throw new c0.c();
        }
        Object obj = this.f1158f;
        obj.getClass();
        Log.d("g", this.f1159g + " value: " + obj);
        return null;
    }

    @Override // a.a
    public final a.a x(String str, c1.l lVar) {
        return this;
    }
}
