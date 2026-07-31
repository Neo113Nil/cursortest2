package u0;

import D3.A;
import D3.B;
import D3.D;
import D3.M;
import D3.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import g.AbstractC0389a;
import h.AbstractC0401a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import k.AbstractC0441C;
import k.C0456o;
import l5.AbstractC0506j;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673c implements D, O3.i, O3.b, O3.c, k1.a, c4.r, f0.h {

    /* renamed from: f, reason: collision with root package name */
    public Object f5968f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5969g;

    public /* synthetic */ C0673c(Object obj) {
        this.f5968f = obj;
    }

    @Override // k1.a
    public Object a(k1.n nVar) {
        Q0.b bVar = (Q0.b) this.f5968f;
        Bundle bundle = (Bundle) this.f5969g;
        bVar.getClass();
        if (!nVar.h()) {
            return nVar;
        }
        Bundle bundle2 = (Bundle) nVar.f();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? nVar : bVar.a(bundle).i(Q0.h.f1981h, Q0.d.f1976i);
    }

    @Override // D3.D
    public void b(KeyEvent keyEvent, B b7) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            b7.b(false);
            return;
        }
        Character a7 = ((A) this.f5969g).a(keyEvent.getUnicodeChar());
        boolean z5 = action != 0;
        J1.c cVar = (J1.c) this.f5968f;
        B0.b bVar = new B0.b(2, b7);
        B0.c cVar2 = (B0.c) cVar.f1289g;
        HashMap hashMap = new HashMap();
        hashMap.put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, z5 ? "keyup" : "keydown");
        hashMap.put("keymap", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a7.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        cVar2.z(hashMap, new B0.b(10, bVar));
    }

    @Override // c4.r
    public c4.q build() {
        return (c4.q) ((H1.A) this.f5968f).a(V3.a.f2706i, (String) this.f5969g);
    }

    public void c() {
        X5.h hVar;
        ImageView imageView = (ImageView) this.f5968f;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i7 = AbstractC0441C.f4894a;
        }
        if (drawable == null || (hVar = (X5.h) this.f5969g) == null) {
            return;
        }
        C0456o.c(drawable, hVar, imageView.getDrawableState());
    }

    @Override // O3.c
    public void d(ByteBuffer byteBuffer, F3.f fVar) {
        B0.c cVar = (B0.c) this.f5969g;
        try {
            ((J1.c) this.f5968f).o(((O3.h) cVar.f73i).f(byteBuffer), new C0689s(this, fVar));
        } catch (RuntimeException e4) {
            Log.e("BasicMessageChannel#".concat((String) cVar.f71g), "Failed to handle message", e4);
            fVar.a(null);
        }
    }

    public boolean e(C0680j c0680j) {
        boolean containsKey;
        synchronized (this.f5968f) {
            containsKey = ((LinkedHashMap) this.f5969g).containsKey(c0680j);
        }
        return containsKey;
    }

    public ArrayList f(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5968f;
        Q.k e4 = Q.k.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e4.o(1);
        } else {
            e4.B(str, 1);
        }
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            return arrayList;
        } finally {
            m4.close();
            e4.g();
        }
    }

    @Override // O3.i
    public void g(C0675e c0675e, N3.j jVar) {
        M m4 = (M) this.f5969g;
        if (((B0.c) m4.f401g) == null) {
            jVar.d((Map) this.f5968f);
            return;
        }
        String str = (String) c0675e.f5975b;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            jVar.b();
            return;
        }
        try {
            this.f5968f = Collections.unmodifiableMap(((z) ((D[]) ((B0.c) m4.f401g).f72h)[0]).f505g);
        } catch (IllegalStateException e4) {
            jVar.a("error", e4.getMessage(), null);
        }
        jVar.d((Map) this.f5968f);
    }

    public void h(int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f5968f;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0389a.f4258e;
        B0.c r6 = B0.c.r(context, null, iArr, i7);
        TypedArray typedArray = (TypedArray) r6.f73i;
        D.D.a(imageView, imageView.getContext(), iArr, null, (TypedArray) r6.f73i, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0401a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int i8 = AbstractC0441C.f4894a;
            }
            if (typedArray.hasValue(2)) {
                I.e.c(imageView, r6.l(2));
            }
            if (typedArray.hasValue(3)) {
                I.e.d(imageView, AbstractC0441C.b(typedArray.getInt(3, -1), null));
            }
            r6.v();
        } catch (Throwable th) {
            r6.v();
            throw th;
        }
    }

    public void i(A.h hVar) {
        Handler handler = (Handler) this.f5969g;
        a6.d dVar = (a6.d) this.f5968f;
        int i7 = hVar.f20b;
        if (i7 != 0) {
            handler.post(new A.b(dVar, i7));
        } else {
            handler.post(new A.a(dVar, 0, hVar.f19a));
        }
    }

    public List j(String workSpecId) {
        List P6;
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        synchronized (this.f5968f) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5969g;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.i.a(((C0680j) entry.getKey()).f5985a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f5969g).remove((C0680j) it.next());
                }
                P6 = AbstractC0506j.P(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return P6;
    }

    public m0.j k(C0680j c0680j) {
        m0.j jVar;
        synchronized (this.f5968f) {
            jVar = (m0.j) ((LinkedHashMap) this.f5969g).remove(c0680j);
        }
        return jVar;
    }

    public m0.j l(C0680j c0680j) {
        m0.j jVar;
        synchronized (this.f5968f) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5969g;
                Object obj = linkedHashMap.get(c0680j);
                if (obj == null) {
                    obj = new m0.j(c0680j);
                    linkedHashMap.put(c0680j, obj);
                }
                jVar = (m0.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public void m(boolean z5, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f5968f)) {
            hashMap = new HashMap((Map) this.f5968f);
        }
        synchronized (((Map) this.f5969g)) {
            hashMap2 = new HashMap((Map) this.f5969g);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((k1.h) entry2.getKey()).b(new H1.z(status));
            }
        }
    }

    @Override // O3.b
    public void o(Object obj) {
        B0.c cVar = (B0.c) this.f5969g;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) cVar.f72h;
        N3.l lVar = (N3.l) this.f5968f;
        concurrentLinkedQueue.remove(lVar);
        if (((ConcurrentLinkedQueue) cVar.f72h).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + lVar.f1728a);
    }

    public /* synthetic */ C0673c(Object obj, Object obj2) {
        this.f5968f = obj;
        this.f5969g = obj2;
    }

    public /* synthetic */ C0673c(Object obj, Object obj2, boolean z5) {
        this.f5969g = obj;
        this.f5968f = obj2;
    }

    public C0673c(int i7) {
        switch (i7) {
            case 12:
                this.f5968f = new Object();
                this.f5969g = new LinkedHashMap();
                break;
            default:
                this.f5968f = Collections.synchronizedMap(new WeakHashMap());
                this.f5969g = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }
}
