package f4;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b.C0518b;
import b.InterfaceC0520d;
import b0.C0521a;
import b0.C0522b;
import com.google.android.gms.internal.ads.C4236yh;
import com.google.android.gms.internal.consent_sdk.C4329f;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4361n;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.O;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import k.AbstractC4614b;
import k.C4618f;
import k.InterfaceC4613a;
import l.MenuC4669A;
import p.BinderC4845e;

/* loaded from: classes2.dex */
public final class p implements a3, InterfaceC4613a, u2.e {

    /* renamed from: y, reason: collision with root package name */
    public static p f37761y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37762n;

    /* renamed from: u, reason: collision with root package name */
    public Object f37763u;

    /* renamed from: v, reason: collision with root package name */
    public Object f37764v;

    /* renamed from: w, reason: collision with root package name */
    public Object f37765w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f37766x;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f37762n = i;
        this.f37763u = obj;
        this.f37764v = obj2;
        this.f37765w = obj3;
        this.f37766x = obj4;
    }

    public static synchronized p f() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f37761y == null) {
                    f37761y = new p();
                }
                pVar = f37761y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // k.InterfaceC4613a
    public boolean a(AbstractC4614b abstractC4614b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f37763u).onActionItemClicked(c(abstractC4614b), new l.s((Context) this.f37764v, (I.a) menuItem));
    }

    @Override // k.InterfaceC4613a
    public boolean b(AbstractC4614b abstractC4614b, l.l lVar) {
        C4618f c4 = c(abstractC4614b);
        s.k kVar = (s.k) this.f37766x;
        Menu menu = (Menu) kVar.getOrDefault(lVar, null);
        if (menu == null) {
            menu = new MenuC4669A((Context) this.f37764v, lVar);
            kVar.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.f37763u).onPrepareActionMode(c4, menu);
    }

    public C4618f c(AbstractC4614b abstractC4614b) {
        ArrayList arrayList = (ArrayList) this.f37765w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4618f c4618f = (C4618f) arrayList.get(i);
            if (c4618f != null && c4618f.f38620b == abstractC4614b) {
                return c4618f;
            }
        }
        C4618f c4618f2 = new C4618f((Context) this.f37764v, abstractC4614b);
        arrayList.add(c4618f2);
        return c4618f2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public /* bridge */ /* synthetic */ Object d() {
        switch (this.f37762n) {
            case 3:
                return l();
            default:
                return new W0((C4333g) ((Z2) this.f37763u).d(), ((C4236yh) this.f37764v).d(), (C4361n) ((Z2) this.f37765w).d(), (C4400x) ((Z2) this.f37766x).d());
        }
    }

    @Override // k.InterfaceC4613a
    public boolean e(AbstractC4614b abstractC4614b, l.l lVar) {
        C4618f c4 = c(abstractC4614b);
        s.k kVar = (s.k) this.f37766x;
        Menu menu = (Menu) kVar.getOrDefault(lVar, null);
        if (menu == null) {
            menu = new MenuC4669A((Context) this.f37764v, lVar);
            kVar.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.f37763u).onCreateActionMode(c4, menu);
    }

    public boolean g(Context context) {
        if (((Boolean) this.f37765w) == null) {
            this.f37765w = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f37764v).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f37765w).booleanValue();
    }

    @Override // u2.e
    public void h(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f37763u);
        jsonWriter.name("verb").value((String) this.f37764v);
        jsonWriter.endObject();
        u2.f.d(jsonWriter, (Map) this.f37765w);
        byte[] bArr = (byte[]) this.f37766x;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    @Override // k.InterfaceC4613a
    public void i(AbstractC4614b abstractC4614b) {
        ((ActionMode.Callback) this.f37763u).onDestroyActionMode(c(abstractC4614b));
    }

    public boolean j(Context context) {
        if (((Boolean) this.f37764v) == null) {
            this.f37764v = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f37764v).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f37764v).booleanValue();
    }

    public void k(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f37763u) {
            try {
                try {
                    ((C0518b) ((InterfaceC0520d) this.f37764v)).A0((BinderC4845e) this.f37765w, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public S0.i l() {
        return new S0.i((O) ((Z2) this.f37763u).d(), ((C4329f) this.f37764v).a(), (C4333g) ((Z2) this.f37765w).d(), (C4400x) ((Z2) this.f37766x).d(), 5);
    }

    public p(Context context, Y2.e eVar) {
        this.f37762n = 1;
        kotlin.jvm.internal.h.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        Q0.a aVar = new Q0.a(applicationContext, eVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext2, "context.applicationContext");
        Q0.a aVar2 = new Q0.a(applicationContext2, eVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext3, "context.applicationContext");
        String str = Q0.j.f2711a;
        Q0.i iVar = new Q0.i(applicationContext3, eVar);
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext4, "context.applicationContext");
        Q0.a aVar3 = new Q0.a(applicationContext4, eVar, 2);
        this.f37763u = aVar;
        this.f37764v = aVar2;
        this.f37765w = iVar;
        this.f37766x = aVar3;
    }

    public p(Typeface typeface, C0522b c0522b) {
        int i;
        int i4;
        int i9;
        int i10;
        this.f37762n = 2;
        this.f37766x = typeface;
        this.f37763u = c0522b;
        this.f37765w = new androidx.emoji2.text.r(1024);
        int a9 = c0522b.a(6);
        if (a9 != 0) {
            int i11 = a9 + c0522b.f2228n;
            i = ((ByteBuffer) c0522b.f2231w).getInt(((ByteBuffer) c0522b.f2231w).getInt(i11) + i11);
        } else {
            i = 0;
        }
        this.f37764v = new char[i * 2];
        int a10 = c0522b.a(6);
        if (a10 != 0) {
            int i12 = a10 + c0522b.f2228n;
            i4 = ((ByteBuffer) c0522b.f2231w).getInt(((ByteBuffer) c0522b.f2231w).getInt(i12) + i12);
        } else {
            i4 = 0;
        }
        for (int i13 = 0; i13 < i4; i13++) {
            androidx.emoji2.text.u uVar = new androidx.emoji2.text.u(this, i13);
            C0521a b9 = uVar.b();
            int a11 = b9.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b9.f2231w).getInt(a11 + b9.f2228n) : 0, (char[]) this.f37764v, i13 * 2);
            C0521a b10 = uVar.b();
            int a12 = b10.a(16);
            if (a12 != 0) {
                int i14 = a12 + b10.f2228n;
                i9 = ((ByteBuffer) b10.f2231w).getInt(((ByteBuffer) b10.f2231w).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            S0.f.d("invalid metadata codepoint length", i9 > 0);
            C0521a b11 = uVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i15 = a13 + b11.f2228n;
                i10 = ((ByteBuffer) b11.f2231w).getInt(((ByteBuffer) b11.f2231w).getInt(i15) + i15);
            } else {
                i10 = 0;
            }
            ((androidx.emoji2.text.r) this.f37765w).a(uVar, 0, i10 - 1);
        }
    }

    public p(InterfaceC0520d interfaceC0520d, BinderC4845e binderC4845e, ComponentName componentName) {
        this.f37762n = 6;
        this.f37763u = new Object();
        this.f37764v = interfaceC0520d;
        this.f37765w = binderC4845e;
        this.f37766x = componentName;
    }

    public p() {
        this.f37762n = 0;
        this.f37763u = null;
        this.f37764v = null;
        this.f37765w = null;
        this.f37766x = new ArrayDeque();
    }

    public p(Context context, ActionMode.Callback callback) {
        this.f37762n = 5;
        this.f37764v = context;
        this.f37763u = callback;
        this.f37765w = new ArrayList();
        this.f37766x = new s.k();
    }
}
