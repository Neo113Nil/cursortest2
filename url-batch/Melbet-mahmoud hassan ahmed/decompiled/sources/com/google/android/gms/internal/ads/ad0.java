package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public final class ad0 extends cd0 {

    /* renamed from: g, reason: collision with root package name */
    private static final gf0 f2733g = new gf0();

    /* renamed from: f, reason: collision with root package name */
    private Map<Class<Object>, Object> f2734f;

    @Override // com.google.android.gms.internal.ads.dd0
    public final cf0 j0(String str) {
        return new nf0((RtbAdapter) Class.forName(str, false, gf0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final gd0 s(String str) {
        gd0 he0Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, ad0.class.getClassLoader());
                if (com.google.ads.mediation.b.class.isAssignableFrom(cls)) {
                    com.google.ads.mediation.b bVar = (com.google.ads.mediation.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new he0(bVar, (com.google.ads.mediation.f) this.f2734f.get(bVar.getAdditionalParametersType()));
                }
                if (c3.f.class.isAssignableFrom(cls)) {
                    return new ce0((c3.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (c3.a.class.isAssignableFrom(cls)) {
                    return new ce0((c3.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                io0.g(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                io0.h(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            io0.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                he0Var = new ce0(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                he0Var = new ce0(new AdUrlAdapter());
            } else {
                if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        CustomEventAdapter customEventAdapter = new CustomEventAdapter();
                        he0Var = new he0(customEventAdapter, (d3.c) this.f2734f.get(customEventAdapter.getAdditionalParametersType()));
                    }
                    throw new RemoteException();
                }
                he0Var = new ce0(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
            }
            return he0Var;
        }
    }

    public final void t6(Map<Class<Object>, Object> map) {
        this.f2734f = map;
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final boolean u(String str) {
        try {
            return c3.a.class.isAssignableFrom(Class.forName(str, false, ad0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            io0.g(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final boolean z(String str) {
        try {
            return d3.a.class.isAssignableFrom(Class.forName(str, false, ad0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            io0.g(sb.toString());
            return false;
        }
    }
}
