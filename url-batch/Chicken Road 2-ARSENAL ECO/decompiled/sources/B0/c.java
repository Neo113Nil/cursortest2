package B0;

import D0.j;
import D0.s;
import D3.B;
import D3.C;
import D3.D;
import D3.E;
import D3.M;
import D3.z;
import H1.A;
import H1.AbstractC0131e;
import H1.RunnableC0134h;
import J0.k;
import J0.l;
import U0.h;
import U0.t;
import a.AbstractC0219a;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.AbstractC0248o;
import androidx.lifecycle.AbstractServiceC0256x;
import androidx.lifecycle.C0255w;
import androidx.lifecycle.EnumC0246m;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.work.OverwritingInputMerger;
import com.google.firebase.messaging.FirebaseMessagingService;
import h.AbstractC0401a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import j5.InterfaceC0438a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import k.C0459s;
import k.v0;
import k1.n;
import kotlin.jvm.internal.i;
import l0.g;
import l0.r;
import n6.p;
import n6.q;
import n6.u;
import n6.v;
import n6.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;
import q.C0586f;
import q0.AbstractC0595c;
import q0.InterfaceC0594b;
import r0.AbstractC0610b;
import r0.C0609a;
import r0.C0611c;
import r0.C0612d;
import s0.AbstractC0627e;
import s0.C0623a;
import t.m;
import t1.C0655b;
import t1.InterfaceC0657d;
import u.AbstractC0667b;
import u0.AbstractC0676f;
import u0.C0673c;
import u0.C0675e;
import u0.C0679i;
import u0.C0682l;
import u0.C0684n;
import u0.C0686p;
import v.AbstractC0701f;
import v.InterfaceC0697b;
import x0.InterfaceC0725a;
import y1.C0760d;

/* loaded from: classes.dex */
public final class c implements F0.b, k1.c, v, InterfaceC0725a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f70f;

    /* renamed from: g, reason: collision with root package name */
    public Object f71g;

    /* renamed from: h, reason: collision with root package name */
    public Object f72h;

    /* renamed from: i, reason: collision with root package name */
    public Object f73i;

    public /* synthetic */ c(int i7, boolean z5) {
        this.f70f = i7;
    }

    public static c r(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public void A(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f71g = str;
    }

    public void B(long j4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.e(timeUnit, "timeUnit");
        ((C0686p) this.f73i).f6006g = timeUnit.toMillis(j4);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((C0686p) this.f73i).f6006g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public void C(O3.i iVar) {
        C0682l c0682l;
        O3.e eVar = (O3.e) this.f72h;
        String str = (String) this.f71g;
        if (iVar == null) {
            c0682l = null;
        } else {
            C0682l c0682l2 = new C0682l();
            c0682l2.f5990g = this;
            c0682l2.f5989f = iVar;
            c0682l = c0682l2;
        }
        eVar.d(str, c0682l);
    }

    @Override // n6.v
    public u b() {
        return (p) this.f71g;
    }

    @Override // n6.v
    public w c() {
        return (q) this.f73i;
    }

    public boolean d(String workSpecId) {
        AbstractC0610b abstractC0610b;
        boolean z5;
        i.e(workSpecId, "workSpecId");
        synchronized (this.f71g) {
            try {
                AbstractC0610b[] abstractC0610bArr = (AbstractC0610b[]) this.f73i;
                int length = abstractC0610bArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        abstractC0610b = null;
                        break;
                    }
                    abstractC0610b = abstractC0610bArr[i7];
                    abstractC0610b.getClass();
                    Object obj = abstractC0610b.f5844d;
                    if (obj != null && abstractC0610b.b(obj) && abstractC0610b.f5843c.contains(workSpecId)) {
                        break;
                    }
                    i7++;
                }
                if (abstractC0610b != null) {
                    l0.q.d().a(AbstractC0595c.f5753a, "Work " + workSpecId + " constrained by " + abstractC0610b.getClass().getSimpleName());
                }
                z5 = abstractC0610b == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    public j e() {
        String str = ((String) this.f71g) == null ? " backendName" : "";
        if (((A0.d) this.f73i) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new j((String) this.f71g, (byte[]) this.f72h, (A0.d) this.f73i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public r f() {
        r rVar = new r((UUID) this.f72h, (C0686p) this.f73i, (LinkedHashSet) this.f71g);
        l0.d dVar = ((C0686p) this.f73i).f6009j;
        boolean z5 = !dVar.f5262h.isEmpty() || dVar.f5258d || dVar.f5256b || dVar.f5257c;
        C0686p c0686p = (C0686p) this.f73i;
        if (c0686p.f6016q) {
            if (z5) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c0686p.f6006g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        i.d(randomUUID, "randomUUID()");
        this.f72h = randomUUID;
        String uuid = randomUUID.toString();
        i.d(uuid, "id.toString()");
        C0686p other = (C0686p) this.f73i;
        i.e(other, "other");
        String str = other.f6002c;
        int i7 = other.f6001b;
        String str2 = other.f6003d;
        g gVar = new g(other.f6004e);
        g gVar2 = new g(other.f6005f);
        long j4 = other.f6006g;
        long j7 = other.f6007h;
        long j8 = other.f6008i;
        l0.d other2 = other.f6009j;
        i.e(other2, "other");
        this.f73i = new C0686p(uuid, i7, str, str2, gVar, gVar2, j4, j7, j8, new l0.d(other2.f5255a, other2.f5256b, other2.f5257c, other2.f5258d, other2.f5259e, other2.f5260f, other2.f5261g, other2.f5262h), other.f6010k, other.f6011l, other.f6012m, other.f6013n, other.f6014o, other.f6015p, other.f6016q, other.f6017r, other.f6018s, 524288, 0);
        return rVar;
    }

    public void g(int i7, f fVar) {
        ((FlutterJNI) this.f73i).dispatchSemanticsAction(i7, fVar);
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        switch (this.f70f) {
            case 3:
                return new s(new h(4), new R0.g(), (I0.b) ((A.e) this.f72h).get(), (k) ((v0) this.f73i).get(), (l) ((C0679i) this.f71g).get());
            default:
                return new J0.d((Context) ((InterfaceC0438a) this.f72h).get(), (K0.d) ((InterfaceC0438a) this.f73i).get(), (J0.b) ((C0760d) this.f71g).get());
        }
    }

    @Override // k1.c
    public void h(n nVar) {
        Q0.b bVar = (Q0.b) this.f72h;
        String str = (String) this.f71g;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f73i;
        synchronized (bVar.f1966a) {
            bVar.f1966a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void i(int i7, f fVar, Serializable serializable) {
        ((FlutterJNI) this.f73i).dispatchSemanticsAction(i7, fVar, serializable);
    }

    public void j(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f72h;
        w1.f fVar = new w1.f(byteArrayOutputStream, hashMap, (HashMap) this.f73i, (InterfaceC0657d) this.f71g);
        InterfaceC0657d interfaceC0657d = (InterfaceC0657d) hashMap.get(obj.getClass());
        if (interfaceC0657d != null) {
            interfaceC0657d.a(obj, fVar);
        } else {
            throw new C0655b("No encoder for " + obj.getClass());
        }
    }

    public S k(String key, Class cls) {
        S viewModel;
        V v5 = (V) this.f73i;
        i.e(key, "key");
        X x6 = (X) this.f72h;
        x6.getClass();
        LinkedHashMap linkedHashMap = x6.f3498a;
        S s6 = (S) linkedHashMap.get(key);
        if (!cls.isInstance(s6)) {
            O.c cVar = new O.c((O.b) this.f71g);
            cVar.f1763a.put(T.f3494b, key);
            try {
                viewModel = v5.b(cls, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = v5.a(cls);
            }
            i.e(viewModel, "viewModel");
            S s7 = (S) linkedHashMap.put(key, viewModel);
            if (s7 != null) {
                s7.onCleared();
            }
            return viewModel;
        }
        O o7 = v5 instanceof O ? (O) v5 : null;
        if (o7 != null) {
            i.b(s6);
            AbstractC0248o abstractC0248o = o7.f3486d;
            if (abstractC0248o != null) {
                T.f fVar = o7.f3487e;
                i.b(fVar);
                L.a(s6, fVar, abstractC0248o);
            }
        }
        i.c(s6, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return s6;
    }

    public ColorStateList l(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f73i;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0) {
            Context context = (Context) this.f72h;
            Object obj = AbstractC0401a.f4318a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i7);
    }

    public Drawable m(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f73i;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : AbstractC0401a.a((Context) this.f72h, resourceId);
    }

    public Typeface n(int i7, int i8, C0459s c0459s) {
        C0459s c0459s2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f73i).getResourceId(i7, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f71g) == null) {
                this.f71g = new TypedValue();
            }
            Context context = (Context) this.f72h;
            TypedValue typedValue = (TypedValue) this.f71g;
            Object obj = AbstractC0701f.f6052a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    c0459s.a();
                    return null;
                }
                int i9 = typedValue.assetCookie;
                C0586f c0586f = w.d.f6132b;
                Typeface typeface = (Typeface) c0586f.a(w.d.b(resources, resourceId, charSequence2, i9, i8));
                int i10 = 12;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new G4.c(c0459s, i10, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        c0459s2 = c0459s;
                        try {
                            int i11 = typedValue.assetCookie;
                            Typeface j4 = w.d.f6131a.j(context, resources, resourceId, charSequence2, i8);
                            if (j4 != null) {
                                c0586f.b(w.d.b(resources, resourceId, charSequence2, i11, i8), j4);
                            }
                            if (j4 != null) {
                                new Handler(Looper.getMainLooper()).post(new G4.c(c0459s2, i10, j4));
                            } else {
                                c0459s2.a();
                            }
                            return j4;
                        } catch (IOException e4) {
                            e = e4;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            c0459s2.a();
                            return null;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            c0459s2.a();
                            return null;
                        }
                    }
                    InterfaceC0697b q6 = AbstractC0676f.q(resources.getXml(resourceId), resources);
                    if (q6 != null) {
                        try {
                            return w.d.a(context, q6, resources, resourceId, charSequence2, typedValue.assetCookie, i8, c0459s);
                        } catch (IOException e8) {
                            e = e8;
                            c0459s2 = c0459s;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            c0459s2.a();
                            return null;
                        } catch (XmlPullParserException e9) {
                            e = e9;
                            c0459s2 = c0459s;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            c0459s2.a();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c0459s.a();
                        return null;
                    } catch (IOException e10) {
                        iOException = e10;
                        c0459s2 = c0459s;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        c0459s2.a();
                        return null;
                    } catch (XmlPullParserException e11) {
                        xmlPullParserException = e11;
                        c0459s2 = c0459s;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        c0459s2.a();
                        return null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    c0459s2 = c0459s;
                } catch (XmlPullParserException e13) {
                    e = e13;
                    c0459s2 = c0459s;
                }
            }
        }
        return null;
    }

    public boolean o(KeyEvent keyEvent) {
        D[] dArr = (D[]) this.f72h;
        if (((HashSet) this.f73i).remove(keyEvent)) {
            return false;
        }
        if (dArr.length <= 0) {
            s(keyEvent);
            return true;
        }
        C c7 = new C(this, keyEvent);
        for (D d7 : dArr) {
            d7.b(keyEvent, new B(c7));
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(84:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(81:278|279|23|(1:25)|26|27|28|(1:30)|275|32|33|(3:250|251|(75:253|(67:255|(1:257)|36|(1:38)|39|(1:41)(1:249)|42|(2:44|(1:234)(57:48|49|(1:51)|52|(1:54)(2:224|(1:229)(1:228))|(1:56)|57|(1:59)(5:212|(1:214)|215|(1:217)(1:223)|(1:219)(2:220|(1:222)))|60|(1:62)(6:191|(4:194|(2:201|202)(1:204)|203|192)|207|208|(1:210)|211)|63|(1:65)(1:190)|(1:67)|68|(41:186|187|(1:74)|75|(1:77)|78|(35:177|(1:181)|(1:82)|83|(31:172|(1:176)|(1:87)|88|(27:169|(1:171)|(1:92)|93|(23:165|166|(1:97)|98|(3:155|156|(20:158|(1:160)|161|(1:102)|103|(4:140|141|142|(2:144|(14:146|(3:107|(1:112)(1:110)|111)|113|(1:115)|116|(1:118)|119|(1:139)|121|(4:128|129|(1:131)(1:134)|132)|123|(1:125)|126|127)(2:147|148))(2:149|150))|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)(2:162|163))|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|70|(41:182|183|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127))(1:248)|235|(2:243|244)|(1:242)|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|258|(70:260|(1:262)|36|(0)|39|(0)(0)|42|(0)(0)|235|(1:237)|243|244|(1:240)|242|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)(1:271)|263|(3:265|(1:267)(1:269)|268)|270|36|(0)|39|(0)(0)|42|(0)(0)|235|(0)|243|244|(0)|242|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127))|35|36|(0)|39|(0)(0)|42|(0)(0)|235|(0)|243|244|(0)|242|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127)|22|23|(0)|26|27|28|(0)|275|32|33|(0)|35|36|(0)|39|(0)(0)|42|(0)(0)|235|(0)|243|244|(0)|242|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|(0)|126|127) */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0210, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0211, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00c2, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0379 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[Catch: NameNotFoundException -> 0x00c1, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x00c1, blocks: (B:28:0x00b5, B:30:0x00bb), top: B:27:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean p() {
        H1.u uVar;
        FirebaseMessagingService firebaseMessagingService;
        J1.c cVar;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        AtomicInteger atomicInteger;
        String packageName;
        PackageManager packageManager;
        String k4;
        String k7;
        int i7;
        String l7;
        int i8;
        int i9;
        String l8;
        Uri defaultUri;
        String l9;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String l10;
        Integer valueOf;
        String l11;
        Integer h7;
        Integer h8;
        Integer h9;
        String l12;
        Long valueOf2;
        JSONArray j4;
        long[] jArr;
        JSONArray j7;
        int[] iArr;
        String l13;
        IconCompat iconCompat;
        boolean z5;
        int i10;
        ApplicationInfo applicationInfo;
        if (((J1.c) this.f71g).f("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f73i;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String l14 = ((J1.c) this.f71g).l("gcm.n.image");
        if (!TextUtils.isEmpty(l14)) {
            try {
                uVar = new H1.u(new URL(l14));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + l14);
            }
            int i11 = 2;
            if (uVar != null) {
                ExecutorService executorService = (ExecutorService) this.f72h;
                k1.h hVar = new k1.h();
                uVar.f995g = executorService.submit(new G4.c(uVar, i11, hVar));
                uVar.f996h = hVar.f5157a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f73i;
            cVar = (J1.c) this.f71g;
            AtomicInteger atomicInteger2 = AbstractC0131e.f953a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String l15 = cVar.l("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(l15)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(l15);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + l15 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        atomicInteger = AbstractC0131e.f953a;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        t.p pVar = new t.p(firebaseMessagingService, l15);
                        k4 = cVar.k(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(k4)) {
                            pVar.f5921e = t.p.b(k4);
                        }
                        k7 = cVar.k(resources, packageName, "gcm.n.body");
                        if (TextUtils.isEmpty(k7)) {
                            i7 = 1;
                        } else {
                            i7 = 1;
                            pVar.f5922f = t.p.b(k7);
                            t.n nVar = new t.n(0);
                            nVar.f5916f = t.p.b(k7);
                            pVar.g(nVar);
                        }
                        l7 = cVar.l("gcm.n.icon");
                        if (TextUtils.isEmpty(l7)) {
                            i8 = 2;
                        } else {
                            i9 = resources.getIdentifier(l7, "drawable", packageName);
                            if ((i9 != 0 && AbstractC0131e.a(resources, i9)) || ((i9 = resources.getIdentifier(l7, "mipmap", packageName)) != 0 && AbstractC0131e.a(resources, i9))) {
                                i8 = 2;
                                pVar.f5938v.icon = i9;
                                l8 = cVar.l("gcm.n.sound2");
                                if (TextUtils.isEmpty(l8)) {
                                    l8 = cVar.l("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(l8)) {
                                    defaultUri = null;
                                } else if ("default".equals(l8) || resources.getIdentifier(l8, "raw", packageName) == 0) {
                                    defaultUri = RingtoneManager.getDefaultUri(i8);
                                } else {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + l8);
                                }
                                if (defaultUri != null) {
                                    pVar.f(defaultUri);
                                }
                                l9 = cVar.l("gcm.n.click_action");
                                if (TextUtils.isEmpty(l9)) {
                                    launchIntentForPackage = new Intent(l9);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String l16 = cVar.l("gcm.n.link_android");
                                    if (TextUtils.isEmpty(l16)) {
                                        l16 = cVar.l("gcm.n.link");
                                    }
                                    Uri parse = !TextUtils.isEmpty(l16) ? Uri.parse(l16) : null;
                                    if (parse != null) {
                                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                        launchIntentForPackage.setPackage(packageName);
                                        launchIntentForPackage.setData(parse);
                                    } else {
                                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                        if (launchIntentForPackage == null) {
                                            Log.w("FirebaseMessaging", "No activity found to launch app");
                                        }
                                    }
                                }
                                if (launchIntentForPackage != null) {
                                    activity = null;
                                } else {
                                    launchIntentForPackage.addFlags(67108864);
                                    Bundle bundle3 = (Bundle) cVar.f1289g;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (cVar.f("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.s());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                pVar.f5923g = activity;
                                broadcast = cVar.f("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.s())), 1140850688);
                                if (broadcast != null) {
                                    pVar.f5938v.deleteIntent = broadcast;
                                }
                                l10 = cVar.l("gcm.n.color");
                                if (!TextUtils.isEmpty(l10)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(l10));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + l10 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        pVar.f5933q = valueOf.intValue();
                                    }
                                    pVar.d(16, !cVar.f("gcm.n.sticky"));
                                    pVar.f5931o = cVar.f("gcm.n.local_only");
                                    l11 = cVar.l("gcm.n.ticker");
                                    if (l11 != null) {
                                        pVar.f5938v.tickerText = t.p.b(l11);
                                    }
                                    h7 = cVar.h("gcm.n.notification_priority");
                                    if (h7 != null) {
                                        if (h7.intValue() < -2 || h7.intValue() > i8) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + h7 + ". Skipping setting notificationPriority.");
                                        }
                                        if (h7 != null) {
                                            pVar.f5926j = h7.intValue();
                                        }
                                        h8 = cVar.h("gcm.n.visibility");
                                        if (h8 != null) {
                                            if (h8.intValue() < -1 || h8.intValue() > i7) {
                                                Log.w("NotificationParams", "visibility is invalid: " + h8 + ". Skipping setting visibility.");
                                            }
                                            if (h8 != null) {
                                                pVar.f5934r = h8.intValue();
                                            }
                                            h9 = cVar.h("gcm.n.notification_count");
                                            if (h9 != null) {
                                                if (h9.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + h9 + ". Skipping setting notificationCount.");
                                                }
                                                if (h9 != null) {
                                                    pVar.f5925i = h9.intValue();
                                                }
                                                l12 = cVar.l("gcm.n.event_time");
                                                if (!TextUtils.isEmpty(l12)) {
                                                    try {
                                                        valueOf2 = Long.valueOf(Long.parseLong(l12));
                                                    } catch (NumberFormatException unused3) {
                                                        Log.w("NotificationParams", "Couldn't parse value of " + J1.c.t("gcm.n.event_time") + "(" + l12 + ") into a long");
                                                    }
                                                    if (valueOf2 != null) {
                                                        pVar.f5927k = true;
                                                        pVar.f5938v.when = valueOf2.longValue();
                                                    }
                                                    j4 = cVar.j("gcm.n.vibrate_timings");
                                                    if (j4 != null) {
                                                        try {
                                                        } catch (NumberFormatException | JSONException unused4) {
                                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + j4 + ". Skipping setting vibrateTimings.");
                                                        }
                                                        if (j4.length() <= 1) {
                                                            throw new JSONException("vibrateTimings have invalid length");
                                                        }
                                                        int length = j4.length();
                                                        jArr = new long[length];
                                                        for (int i12 = 0; i12 < length; i12++) {
                                                            jArr[i12] = j4.optLong(i12);
                                                        }
                                                        if (jArr != null) {
                                                            pVar.f5938v.vibrate = jArr;
                                                        }
                                                        j7 = cVar.j("gcm.n.light_settings");
                                                        if (j7 != null) {
                                                            iArr = new int[3];
                                                            try {
                                                            } catch (IllegalArgumentException e4) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + j7 + ". " + e4.getMessage() + ". Skipping setting LightSettings");
                                                            } catch (JSONException unused5) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + j7 + ". Skipping setting LightSettings");
                                                            }
                                                            if (j7.length() != 3) {
                                                                throw new JSONException("lightSettings don't have all three fields");
                                                            }
                                                            int parseColor = Color.parseColor(j7.optString(0));
                                                            if (parseColor == -16777216) {
                                                                throw new IllegalArgumentException("Transparent color is invalid");
                                                            }
                                                            iArr[0] = parseColor;
                                                            iArr[1] = j7.optInt(1);
                                                            iArr[2] = j7.optInt(2);
                                                            if (iArr != null) {
                                                                int i13 = iArr[0];
                                                                int i14 = iArr[1];
                                                                int i15 = iArr[2];
                                                                Notification notification = pVar.f5938v;
                                                                notification.ledARGB = i13;
                                                                notification.ledOnMS = i14;
                                                                notification.ledOffMS = i15;
                                                                notification.flags = ((i14 == 0 || i15 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                            }
                                                            boolean f7 = cVar.f("gcm.n.default_sound");
                                                            boolean z6 = f7;
                                                            if (cVar.f("gcm.n.default_vibrate_timings")) {
                                                                z6 = (f7 ? 1 : 0) | 2;
                                                            }
                                                            int i16 = z6;
                                                            if (cVar.f("gcm.n.default_light_settings")) {
                                                                i16 = (z6 ? 1 : 0) | 4;
                                                            }
                                                            pVar.c(i16);
                                                            l13 = cVar.l("gcm.n.tag");
                                                            if (TextUtils.isEmpty(l13)) {
                                                                l13 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                            }
                                                            String str2 = l13;
                                                            if (uVar != null) {
                                                                try {
                                                                    n nVar2 = uVar.f996h;
                                                                    t.f(nVar2);
                                                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                                                    Bitmap bitmap = (Bitmap) AbstractC0219a.d(nVar2, 5L);
                                                                    pVar.e(bitmap);
                                                                    m mVar = new m();
                                                                    if (bitmap == null) {
                                                                        iconCompat = null;
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = true;
                                                                        iconCompat = new IconCompat(1);
                                                                        iconCompat.f3408b = bitmap;
                                                                    }
                                                                    mVar.f5912e = iconCompat;
                                                                    mVar.f5913f = null;
                                                                    mVar.f5914g = z5;
                                                                    pVar.g(mVar);
                                                                } catch (InterruptedException unused6) {
                                                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                    uVar.close();
                                                                    Thread.currentThread().interrupt();
                                                                } catch (ExecutionException e7) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
                                                                } catch (TimeoutException unused7) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                    uVar.close();
                                                                }
                                                            }
                                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                                Log.d("FirebaseMessaging", "Showing notification");
                                                            }
                                                            ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str2, 0, pVar.a());
                                                            return true;
                                                        }
                                                        iArr = null;
                                                        if (iArr != null) {
                                                        }
                                                        boolean f72 = cVar.f("gcm.n.default_sound");
                                                        boolean z62 = f72;
                                                        if (cVar.f("gcm.n.default_vibrate_timings")) {
                                                        }
                                                        int i162 = z62;
                                                        if (cVar.f("gcm.n.default_light_settings")) {
                                                        }
                                                        pVar.c(i162);
                                                        l13 = cVar.l("gcm.n.tag");
                                                        if (TextUtils.isEmpty(l13)) {
                                                        }
                                                        String str22 = l13;
                                                        if (uVar != null) {
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str22, 0, pVar.a());
                                                        return true;
                                                    }
                                                    jArr = null;
                                                    if (jArr != null) {
                                                    }
                                                    j7 = cVar.j("gcm.n.light_settings");
                                                    if (j7 != null) {
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean f722 = cVar.f("gcm.n.default_sound");
                                                    boolean z622 = f722;
                                                    if (cVar.f("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i1622 = z622;
                                                    if (cVar.f("gcm.n.default_light_settings")) {
                                                    }
                                                    pVar.c(i1622);
                                                    l13 = cVar.l("gcm.n.tag");
                                                    if (TextUtils.isEmpty(l13)) {
                                                    }
                                                    String str222 = l13;
                                                    if (uVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str222, 0, pVar.a());
                                                    return true;
                                                }
                                                valueOf2 = null;
                                                if (valueOf2 != null) {
                                                }
                                                j4 = cVar.j("gcm.n.vibrate_timings");
                                                if (j4 != null) {
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                j7 = cVar.j("gcm.n.light_settings");
                                                if (j7 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean f7222 = cVar.f("gcm.n.default_sound");
                                                boolean z6222 = f7222;
                                                if (cVar.f("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i16222 = z6222;
                                                if (cVar.f("gcm.n.default_light_settings")) {
                                                }
                                                pVar.c(i16222);
                                                l13 = cVar.l("gcm.n.tag");
                                                if (TextUtils.isEmpty(l13)) {
                                                }
                                                String str2222 = l13;
                                                if (uVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str2222, 0, pVar.a());
                                                return true;
                                            }
                                            h9 = null;
                                            if (h9 != null) {
                                            }
                                            l12 = cVar.l("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(l12)) {
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            j4 = cVar.j("gcm.n.vibrate_timings");
                                            if (j4 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            j7 = cVar.j("gcm.n.light_settings");
                                            if (j7 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean f72222 = cVar.f("gcm.n.default_sound");
                                            boolean z62222 = f72222;
                                            if (cVar.f("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i162222 = z62222;
                                            if (cVar.f("gcm.n.default_light_settings")) {
                                            }
                                            pVar.c(i162222);
                                            l13 = cVar.l("gcm.n.tag");
                                            if (TextUtils.isEmpty(l13)) {
                                            }
                                            String str22222 = l13;
                                            if (uVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str22222, 0, pVar.a());
                                            return true;
                                        }
                                        h8 = null;
                                        if (h8 != null) {
                                        }
                                        h9 = cVar.h("gcm.n.notification_count");
                                        if (h9 != null) {
                                        }
                                        h9 = null;
                                        if (h9 != null) {
                                        }
                                        l12 = cVar.l("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(l12)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        j4 = cVar.j("gcm.n.vibrate_timings");
                                        if (j4 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        j7 = cVar.j("gcm.n.light_settings");
                                        if (j7 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean f722222 = cVar.f("gcm.n.default_sound");
                                        boolean z622222 = f722222;
                                        if (cVar.f("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i1622222 = z622222;
                                        if (cVar.f("gcm.n.default_light_settings")) {
                                        }
                                        pVar.c(i1622222);
                                        l13 = cVar.l("gcm.n.tag");
                                        if (TextUtils.isEmpty(l13)) {
                                        }
                                        String str222222 = l13;
                                        if (uVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str222222, 0, pVar.a());
                                        return true;
                                    }
                                    h7 = null;
                                    if (h7 != null) {
                                    }
                                    h8 = cVar.h("gcm.n.visibility");
                                    if (h8 != null) {
                                    }
                                    h8 = null;
                                    if (h8 != null) {
                                    }
                                    h9 = cVar.h("gcm.n.notification_count");
                                    if (h9 != null) {
                                    }
                                    h9 = null;
                                    if (h9 != null) {
                                    }
                                    l12 = cVar.l("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(l12)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    j4 = cVar.j("gcm.n.vibrate_timings");
                                    if (j4 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    j7 = cVar.j("gcm.n.light_settings");
                                    if (j7 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean f7222222 = cVar.f("gcm.n.default_sound");
                                    boolean z6222222 = f7222222;
                                    if (cVar.f("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i16222222 = z6222222;
                                    if (cVar.f("gcm.n.default_light_settings")) {
                                    }
                                    pVar.c(i16222222);
                                    l13 = cVar.l("gcm.n.tag");
                                    if (TextUtils.isEmpty(l13)) {
                                    }
                                    String str2222222 = l13;
                                    if (uVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str2222222, 0, pVar.a());
                                    return true;
                                }
                                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                if (i10 != 0) {
                                    try {
                                        valueOf = Integer.valueOf(AbstractC0667b.a(firebaseMessagingService, i10));
                                    } catch (Resources.NotFoundException unused8) {
                                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                    if (valueOf != null) {
                                    }
                                    pVar.d(16, !cVar.f("gcm.n.sticky"));
                                    pVar.f5931o = cVar.f("gcm.n.local_only");
                                    l11 = cVar.l("gcm.n.ticker");
                                    if (l11 != null) {
                                    }
                                    h7 = cVar.h("gcm.n.notification_priority");
                                    if (h7 != null) {
                                    }
                                    h7 = null;
                                    if (h7 != null) {
                                    }
                                    h8 = cVar.h("gcm.n.visibility");
                                    if (h8 != null) {
                                    }
                                    h8 = null;
                                    if (h8 != null) {
                                    }
                                    h9 = cVar.h("gcm.n.notification_count");
                                    if (h9 != null) {
                                    }
                                    h9 = null;
                                    if (h9 != null) {
                                    }
                                    l12 = cVar.l("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(l12)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    j4 = cVar.j("gcm.n.vibrate_timings");
                                    if (j4 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    j7 = cVar.j("gcm.n.light_settings");
                                    if (j7 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean f72222222 = cVar.f("gcm.n.default_sound");
                                    boolean z62222222 = f72222222;
                                    if (cVar.f("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i162222222 = z62222222;
                                    if (cVar.f("gcm.n.default_light_settings")) {
                                    }
                                    pVar.c(i162222222);
                                    l13 = cVar.l("gcm.n.tag");
                                    if (TextUtils.isEmpty(l13)) {
                                    }
                                    String str22222222 = l13;
                                    if (uVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str22222222, 0, pVar.a());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                pVar.d(16, !cVar.f("gcm.n.sticky"));
                                pVar.f5931o = cVar.f("gcm.n.local_only");
                                l11 = cVar.l("gcm.n.ticker");
                                if (l11 != null) {
                                }
                                h7 = cVar.h("gcm.n.notification_priority");
                                if (h7 != null) {
                                }
                                h7 = null;
                                if (h7 != null) {
                                }
                                h8 = cVar.h("gcm.n.visibility");
                                if (h8 != null) {
                                }
                                h8 = null;
                                if (h8 != null) {
                                }
                                h9 = cVar.h("gcm.n.notification_count");
                                if (h9 != null) {
                                }
                                h9 = null;
                                if (h9 != null) {
                                }
                                l12 = cVar.l("gcm.n.event_time");
                                if (!TextUtils.isEmpty(l12)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                j4 = cVar.j("gcm.n.vibrate_timings");
                                if (j4 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                j7 = cVar.j("gcm.n.light_settings");
                                if (j7 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean f722222222 = cVar.f("gcm.n.default_sound");
                                boolean z622222222 = f722222222;
                                if (cVar.f("gcm.n.default_vibrate_timings")) {
                                }
                                int i1622222222 = z622222222;
                                if (cVar.f("gcm.n.default_light_settings")) {
                                }
                                pVar.c(i1622222222);
                                l13 = cVar.l("gcm.n.tag");
                                if (TextUtils.isEmpty(l13)) {
                                }
                                String str222222222 = l13;
                                if (uVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str222222222, 0, pVar.a());
                                return true;
                            }
                            i8 = 2;
                            Log.w("FirebaseMessaging", "Icon resource " + l7 + " not found. Notification will use default icon.");
                        }
                        i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i9 != 0 || !AbstractC0131e.a(resources, i9)) {
                            i9 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        if (i9 != 0 || !AbstractC0131e.a(resources, i9)) {
                            i9 = 17301651;
                        }
                        pVar.f5938v.icon = i9;
                        l8 = cVar.l("gcm.n.sound2");
                        if (TextUtils.isEmpty(l8)) {
                        }
                        if (!TextUtils.isEmpty(l8)) {
                        }
                        if (defaultUri != null) {
                        }
                        l9 = cVar.l("gcm.n.click_action");
                        if (TextUtils.isEmpty(l9)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        pVar.f5923g = activity;
                        if (cVar.f("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        l10 = cVar.l("gcm.n.color");
                        if (!TextUtils.isEmpty(l10)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        pVar.d(16, !cVar.f("gcm.n.sticky"));
                        pVar.f5931o = cVar.f("gcm.n.local_only");
                        l11 = cVar.l("gcm.n.ticker");
                        if (l11 != null) {
                        }
                        h7 = cVar.h("gcm.n.notification_priority");
                        if (h7 != null) {
                        }
                        h7 = null;
                        if (h7 != null) {
                        }
                        h8 = cVar.h("gcm.n.visibility");
                        if (h8 != null) {
                        }
                        h8 = null;
                        if (h8 != null) {
                        }
                        h9 = cVar.h("gcm.n.notification_count");
                        if (h9 != null) {
                        }
                        h9 = null;
                        if (h9 != null) {
                        }
                        l12 = cVar.l("gcm.n.event_time");
                        if (!TextUtils.isEmpty(l12)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        j4 = cVar.j("gcm.n.vibrate_timings");
                        if (j4 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        j7 = cVar.j("gcm.n.light_settings");
                        if (j7 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean f7222222222 = cVar.f("gcm.n.default_sound");
                        boolean z6222222222 = f7222222222;
                        if (cVar.f("gcm.n.default_vibrate_timings")) {
                        }
                        int i16222222222 = z6222222222;
                        if (cVar.f("gcm.n.default_light_settings")) {
                        }
                        pVar.c(i16222222222);
                        l13 = cVar.l("gcm.n.tag");
                        if (TextUtils.isEmpty(l13)) {
                        }
                        String str2222222222 = l13;
                        if (uVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str2222222222, 0, pVar.a());
                        return true;
                    }
                    l15 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(l15)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(l15);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        atomicInteger = AbstractC0131e.f953a;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        t.p pVar2 = new t.p(firebaseMessagingService, l15);
                        k4 = cVar.k(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(k4)) {
                        }
                        k7 = cVar.k(resources2, packageName, "gcm.n.body");
                        if (TextUtils.isEmpty(k7)) {
                        }
                        l7 = cVar.l("gcm.n.icon");
                        if (TextUtils.isEmpty(l7)) {
                        }
                        i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i9 != 0) {
                        }
                        i9 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i9 != 0) {
                        }
                        i9 = 17301651;
                        pVar2.f5938v.icon = i9;
                        l8 = cVar.l("gcm.n.sound2");
                        if (TextUtils.isEmpty(l8)) {
                        }
                        if (!TextUtils.isEmpty(l8)) {
                        }
                        if (defaultUri != null) {
                        }
                        l9 = cVar.l("gcm.n.click_action");
                        if (TextUtils.isEmpty(l9)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        pVar2.f5923g = activity;
                        if (cVar.f("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        l10 = cVar.l("gcm.n.color");
                        if (!TextUtils.isEmpty(l10)) {
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        pVar2.d(16, !cVar.f("gcm.n.sticky"));
                        pVar2.f5931o = cVar.f("gcm.n.local_only");
                        l11 = cVar.l("gcm.n.ticker");
                        if (l11 != null) {
                        }
                        h7 = cVar.h("gcm.n.notification_priority");
                        if (h7 != null) {
                        }
                        h7 = null;
                        if (h7 != null) {
                        }
                        h8 = cVar.h("gcm.n.visibility");
                        if (h8 != null) {
                        }
                        h8 = null;
                        if (h8 != null) {
                        }
                        h9 = cVar.h("gcm.n.notification_count");
                        if (h9 != null) {
                        }
                        h9 = null;
                        if (h9 != null) {
                        }
                        l12 = cVar.l("gcm.n.event_time");
                        if (!TextUtils.isEmpty(l12)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        j4 = cVar.j("gcm.n.vibrate_timings");
                        if (j4 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        j7 = cVar.j("gcm.n.light_settings");
                        if (j7 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean f72222222222 = cVar.f("gcm.n.default_sound");
                        boolean z62222222222 = f72222222222;
                        if (cVar.f("gcm.n.default_vibrate_timings")) {
                        }
                        int i162222222222 = z62222222222;
                        if (cVar.f("gcm.n.default_light_settings")) {
                        }
                        pVar2.c(i162222222222);
                        l13 = cVar.l("gcm.n.tag");
                        if (TextUtils.isEmpty(l13)) {
                        }
                        String str22222222222 = l13;
                        if (uVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str22222222222, 0, pVar2.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(B.a.g(string));
                    }
                    l15 = "fcm_fallback_notification_channel";
                    atomicInteger = AbstractC0131e.f953a;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    t.p pVar22 = new t.p(firebaseMessagingService, l15);
                    k4 = cVar.k(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(k4)) {
                    }
                    k7 = cVar.k(resources22, packageName, "gcm.n.body");
                    if (TextUtils.isEmpty(k7)) {
                    }
                    l7 = cVar.l("gcm.n.icon");
                    if (TextUtils.isEmpty(l7)) {
                    }
                    i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i9 != 0) {
                    }
                    i9 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i9 != 0) {
                    }
                    i9 = 17301651;
                    pVar22.f5938v.icon = i9;
                    l8 = cVar.l("gcm.n.sound2");
                    if (TextUtils.isEmpty(l8)) {
                    }
                    if (!TextUtils.isEmpty(l8)) {
                    }
                    if (defaultUri != null) {
                    }
                    l9 = cVar.l("gcm.n.click_action");
                    if (TextUtils.isEmpty(l9)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    pVar22.f5923g = activity;
                    if (cVar.f("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    l10 = cVar.l("gcm.n.color");
                    if (!TextUtils.isEmpty(l10)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    pVar22.d(16, !cVar.f("gcm.n.sticky"));
                    pVar22.f5931o = cVar.f("gcm.n.local_only");
                    l11 = cVar.l("gcm.n.ticker");
                    if (l11 != null) {
                    }
                    h7 = cVar.h("gcm.n.notification_priority");
                    if (h7 != null) {
                    }
                    h7 = null;
                    if (h7 != null) {
                    }
                    h8 = cVar.h("gcm.n.visibility");
                    if (h8 != null) {
                    }
                    h8 = null;
                    if (h8 != null) {
                    }
                    h9 = cVar.h("gcm.n.notification_count");
                    if (h9 != null) {
                    }
                    h9 = null;
                    if (h9 != null) {
                    }
                    l12 = cVar.l("gcm.n.event_time");
                    if (!TextUtils.isEmpty(l12)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    j4 = cVar.j("gcm.n.vibrate_timings");
                    if (j4 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    j7 = cVar.j("gcm.n.light_settings");
                    if (j7 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean f722222222222 = cVar.f("gcm.n.default_sound");
                    boolean z622222222222 = f722222222222;
                    if (cVar.f("gcm.n.default_vibrate_timings")) {
                    }
                    int i1622222222222 = z622222222222;
                    if (cVar.f("gcm.n.default_light_settings")) {
                    }
                    pVar22.c(i1622222222222);
                    l13 = cVar.l("gcm.n.tag");
                    if (TextUtils.isEmpty(l13)) {
                    }
                    String str222222222222 = l13;
                    if (uVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str222222222222, 0, pVar22.a());
                    return true;
                }
            }
            l15 = null;
            atomicInteger = AbstractC0131e.f953a;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            t.p pVar222 = new t.p(firebaseMessagingService, l15);
            k4 = cVar.k(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(k4)) {
            }
            k7 = cVar.k(resources222, packageName, "gcm.n.body");
            if (TextUtils.isEmpty(k7)) {
            }
            l7 = cVar.l("gcm.n.icon");
            if (TextUtils.isEmpty(l7)) {
            }
            i9 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i9 != 0) {
            }
            i9 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i9 != 0) {
            }
            i9 = 17301651;
            pVar222.f5938v.icon = i9;
            l8 = cVar.l("gcm.n.sound2");
            if (TextUtils.isEmpty(l8)) {
            }
            if (!TextUtils.isEmpty(l8)) {
            }
            if (defaultUri != null) {
            }
            l9 = cVar.l("gcm.n.click_action");
            if (TextUtils.isEmpty(l9)) {
            }
            if (launchIntentForPackage != null) {
            }
            pVar222.f5923g = activity;
            if (cVar.f("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            l10 = cVar.l("gcm.n.color");
            if (!TextUtils.isEmpty(l10)) {
            }
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i10 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            pVar222.d(16, !cVar.f("gcm.n.sticky"));
            pVar222.f5931o = cVar.f("gcm.n.local_only");
            l11 = cVar.l("gcm.n.ticker");
            if (l11 != null) {
            }
            h7 = cVar.h("gcm.n.notification_priority");
            if (h7 != null) {
            }
            h7 = null;
            if (h7 != null) {
            }
            h8 = cVar.h("gcm.n.visibility");
            if (h8 != null) {
            }
            h8 = null;
            if (h8 != null) {
            }
            h9 = cVar.h("gcm.n.notification_count");
            if (h9 != null) {
            }
            h9 = null;
            if (h9 != null) {
            }
            l12 = cVar.l("gcm.n.event_time");
            if (!TextUtils.isEmpty(l12)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            j4 = cVar.j("gcm.n.vibrate_timings");
            if (j4 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            j7 = cVar.j("gcm.n.light_settings");
            if (j7 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean f7222222222222 = cVar.f("gcm.n.default_sound");
            boolean z6222222222222 = f7222222222222;
            if (cVar.f("gcm.n.default_vibrate_timings")) {
            }
            int i16222222222222 = z6222222222222;
            if (cVar.f("gcm.n.default_light_settings")) {
            }
            pVar222.c(i16222222222222);
            l13 = cVar.l("gcm.n.tag");
            if (TextUtils.isEmpty(l13)) {
            }
            String str2222222222222 = l13;
            if (uVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str2222222222222, 0, pVar222.a());
            return true;
        }
        uVar = null;
        int i112 = 2;
        if (uVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f73i;
        cVar = (J1.c) this.f71g;
        AtomicInteger atomicInteger22 = AbstractC0131e.f953a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String l152 = cVar.l("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        l152 = null;
        atomicInteger = AbstractC0131e.f953a;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        t.p pVar2222 = new t.p(firebaseMessagingService, l152);
        k4 = cVar.k(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(k4)) {
        }
        k7 = cVar.k(resources2222, packageName, "gcm.n.body");
        if (TextUtils.isEmpty(k7)) {
        }
        l7 = cVar.l("gcm.n.icon");
        if (TextUtils.isEmpty(l7)) {
        }
        i9 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i9 != 0) {
        }
        i9 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i9 != 0) {
        }
        i9 = 17301651;
        pVar2222.f5938v.icon = i9;
        l8 = cVar.l("gcm.n.sound2");
        if (TextUtils.isEmpty(l8)) {
        }
        if (!TextUtils.isEmpty(l8)) {
        }
        if (defaultUri != null) {
        }
        l9 = cVar.l("gcm.n.click_action");
        if (TextUtils.isEmpty(l9)) {
        }
        if (launchIntentForPackage != null) {
        }
        pVar2222.f5923g = activity;
        if (cVar.f("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        l10 = cVar.l("gcm.n.color");
        if (!TextUtils.isEmpty(l10)) {
        }
        i10 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        pVar2222.d(16, !cVar.f("gcm.n.sticky"));
        pVar2222.f5931o = cVar.f("gcm.n.local_only");
        l11 = cVar.l("gcm.n.ticker");
        if (l11 != null) {
        }
        h7 = cVar.h("gcm.n.notification_priority");
        if (h7 != null) {
        }
        h7 = null;
        if (h7 != null) {
        }
        h8 = cVar.h("gcm.n.visibility");
        if (h8 != null) {
        }
        h8 = null;
        if (h8 != null) {
        }
        h9 = cVar.h("gcm.n.notification_count");
        if (h9 != null) {
        }
        h9 = null;
        if (h9 != null) {
        }
        l12 = cVar.l("gcm.n.event_time");
        if (!TextUtils.isEmpty(l12)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        j4 = cVar.j("gcm.n.vibrate_timings");
        if (j4 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        j7 = cVar.j("gcm.n.light_settings");
        if (j7 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean f72222222222222 = cVar.f("gcm.n.default_sound");
        boolean z62222222222222 = f72222222222222;
        if (cVar.f("gcm.n.default_vibrate_timings")) {
        }
        int i162222222222222 = z62222222222222;
        if (cVar.f("gcm.n.default_light_settings")) {
        }
        pVar2222.c(i162222222222222);
        l13 = cVar.l("gcm.n.tag");
        if (TextUtils.isEmpty(l13)) {
        }
        String str22222222222222 = l13;
        if (uVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f73i).getSystemService("notification")).notify(str22222222222222, 0, pVar2222.a());
        return true;
    }

    public void q(String str, Object obj, N3.j jVar) {
        ((O3.e) this.f72h).k((String) this.f71g, ((O3.j) this.f73i).a(new C0675e(str, 6, obj)), jVar == null ? null : new O3.a(this, 1, jVar));
    }

    public void s(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        HashSet hashSet = (HashSet) this.f73i;
        E e4 = (E) this.f71g;
        if (e4 != null) {
            D3.t tVar = (D3.t) e4;
            io.flutter.plugin.editing.i iVar = tVar.f482q;
            boolean z5 = false;
            if (iVar.f4534b.isAcceptingText() && (cVar = iVar.f4542j) != null) {
                io.flutter.plugin.editing.f fVar = cVar.f4497d;
                if (keyEvent.getAction() == 0) {
                    if (keyEvent.getKeyCode() == 21) {
                        z5 = cVar.d(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 22) {
                        z5 = cVar.d(false, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 19) {
                        z5 = cVar.e(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 20) {
                        z5 = cVar.e(false, keyEvent.isShiftPressed());
                    } else {
                        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = cVar.f4498e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                cVar.performEditorAction(editorInfo.imeOptions & 255);
                                z5 = true;
                            }
                        }
                        int selectionStart = Selection.getSelectionStart(fVar);
                        int selectionEnd = Selection.getSelectionEnd(fVar);
                        int unicodeChar = keyEvent.getUnicodeChar();
                        if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                            int min = Math.min(selectionStart, selectionEnd);
                            int max = Math.max(selectionStart, selectionEnd);
                            cVar.beginBatchEdit();
                            if (min != max) {
                                fVar.delete(min, max);
                            }
                            fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                            int i7 = min + 1;
                            cVar.setSelection(i7, i7);
                            cVar.endBatchEdit();
                            z5 = true;
                        }
                    }
                }
            }
            if (z5) {
                return;
            }
            hashSet.add(keyEvent);
            tVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void t(Activity activity, f0.j jVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f71g;
        i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f73i;
        reentrantLock.lock();
        try {
            if (jVar.equals((f0.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((i0.m) ((V5.g) this.f72h).f2734g).f4416b.iterator();
            while (it.hasNext()) {
                i0.l lVar = (i0.l) it.next();
                if (lVar.f4410a.equals(activity)) {
                    lVar.f4412c = jVar;
                    lVar.f4411b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void u(EnumC0246m enumC0246m) {
        Q q6 = (Q) this.f71g;
        if (q6 != null) {
            q6.run();
        }
        Q q7 = new Q((C0255w) this.f72h, enumC0246m);
        this.f71g = q7;
        ((Handler) this.f73i).postAtFrontOfQueue(q7);
    }

    public void v() {
        ((TypedArray) this.f73i).recycle();
    }

    public void w(Collection workSpecs) {
        i.e(workSpecs, "workSpecs");
        synchronized (this.f71g) {
            try {
                for (AbstractC0610b abstractC0610b : (AbstractC0610b[]) this.f73i) {
                    if (abstractC0610b.f5845e != null) {
                        abstractC0610b.f5845e = null;
                        abstractC0610b.d(null, abstractC0610b.f5844d);
                    }
                }
                for (AbstractC0610b abstractC0610b2 : (AbstractC0610b[]) this.f73i) {
                    abstractC0610b2.c(workSpecs);
                }
                for (AbstractC0610b abstractC0610b3 : (AbstractC0610b[]) this.f73i) {
                    if (abstractC0610b3.f5845e != this) {
                        abstractC0610b3.f5845e = this;
                        abstractC0610b3.d(this, abstractC0610b3.f5844d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.f71g) {
            for (AbstractC0610b abstractC0610b : (AbstractC0610b[]) this.f73i) {
                ArrayList arrayList = abstractC0610b.f5842b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    abstractC0610b.f5841a.b(abstractC0610b);
                }
            }
        }
    }

    public void y(A0.a aVar) {
        B1.g gVar = new B1.g(3);
        s sVar = (s) this.f71g;
        j jVar = (j) this.f72h;
        A0.c cVar = (A0.c) this.f73i;
        I0.b bVar = sVar.f360c;
        c a7 = j.a();
        a7.A(jVar.f342a);
        a7.f73i = A0.d.f43f;
        a7.f72h = jVar.f343b;
        j e4 = a7.e();
        D0.h hVar = new D0.h(0);
        hVar.f335g = new HashMap();
        hVar.f333e = Long.valueOf(sVar.f358a.c());
        hVar.f334f = Long.valueOf(sVar.f359b.c());
        hVar.f330b = "FCM_CLIENT_EVENT_LOGGING";
        I1.e eVar = aVar.f39a;
        c cVar2 = H1.w.f1002a;
        cVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cVar2.j(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        hVar.f332d = new D0.m(cVar, byteArrayOutputStream.toByteArray());
        hVar.f331c = null;
        I0.a aVar2 = (I0.a) bVar;
        aVar2.f1162b.execute(new RunnableC0134h(aVar2, e4, gVar, hVar.c()));
    }

    public void z(Serializable serializable, O3.b bVar) {
        ((O3.e) this.f72h).k((String) this.f71g, ((O3.h) this.f73i).b(serializable), bVar == null ? null : new O3.a(this, 0, bVar));
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i7) {
        this.f70f = i7;
        this.f72h = obj;
        this.f73i = obj2;
        this.f71g = obj3;
    }

    public /* synthetic */ c(Object obj, String str, Object obj2, int i7) {
        this.f70f = i7;
        this.f72h = obj;
        this.f71g = str;
        this.f73i = obj2;
    }

    public c(AbstractServiceC0256x abstractServiceC0256x) {
        this.f70f = 15;
        this.f72h = new C0255w(abstractServiceC0256x);
        this.f73i = new Handler();
    }

    public c(C0684n c0684n) {
        this.f70f = 17;
        this.f72h = c0684n;
        this.f73i = n6.b.b((o6.d) c0684n.f5996i);
        o6.c cVar = (o6.c) c0684n.f5997j;
        i.e(cVar, "<this>");
        this.f71g = new p(cVar);
    }

    public c(j jVar, A0.c cVar, B1.g gVar, s sVar) {
        this.f70f = 2;
        this.f72h = jVar;
        this.f73i = cVar;
        this.f71g = sVar;
    }

    public c(ExecutorService executorService) {
        this.f70f = 25;
        this.f73i = new Handler(Looper.getMainLooper());
        this.f71g = new D0.q(2, this);
        this.f72h = new v0.k(executorService);
    }

    public c(X store, V factory, O.b defaultCreationExtras) {
        this.f70f = 16;
        i.e(store, "store");
        i.e(factory, "factory");
        i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f72h = store;
        this.f73i = factory;
        this.f71g = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(O3.e eVar, String str) {
        this((Object) eVar, str, (Object) O3.m.f1774a, 12);
        this.f70f = 12;
    }

    public c(FirebaseMessagingService firebaseMessagingService, J1.c cVar, ExecutorService executorService) {
        this.f70f = 6;
        this.f72h = executorService;
        this.f73i = firebaseMessagingService;
        this.f71g = cVar;
    }

    public c(Context context, TypedArray typedArray) {
        this.f70f = 19;
        this.f72h = context;
        this.f73i = typedArray;
    }

    public c(Class cls) {
        this.f70f = 20;
        UUID randomUUID = UUID.randomUUID();
        i.d(randomUUID, "randomUUID()");
        this.f72h = randomUUID;
        String uuid = ((UUID) this.f72h).toString();
        i.d(uuid, "id.toString()");
        this.f73i = new C0686p(uuid, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(l5.t.p0(1));
        linkedHashSet.add(strArr[0]);
        this.f71g = linkedHashSet;
        ((C0686p) this.f73i).f6003d = OverwritingInputMerger.class.getName();
    }

    public c(A trackers, InterfaceC0594b interfaceC0594b) {
        this.f70f = 23;
        i.e(trackers, "trackers");
        AbstractC0627e tracker = (AbstractC0627e) trackers.f876a;
        i.e(tracker, "tracker");
        C0609a c0609a = new C0609a(tracker, 0);
        C0623a tracker2 = (C0623a) trackers.f877b;
        i.e(tracker2, "tracker");
        C0609a c0609a2 = new C0609a(tracker2, 1);
        AbstractC0627e tracker3 = (AbstractC0627e) trackers.f879d;
        i.e(tracker3, "tracker");
        C0609a c0609a3 = new C0609a(tracker3, 4);
        AbstractC0627e tracker4 = (AbstractC0627e) trackers.f878c;
        i.e(tracker4, "tracker");
        C0609a c0609a4 = new C0609a(tracker4, 2);
        i.e(tracker4, "tracker");
        C0609a c0609a5 = new C0609a(tracker4, 3);
        i.e(tracker4, "tracker");
        C0612d c0612d = new C0612d(tracker4);
        i.e(tracker4, "tracker");
        AbstractC0610b[] abstractC0610bArr = {c0609a, c0609a2, c0609a3, c0609a4, c0609a5, c0612d, new C0611c(tracker4)};
        this.f72h = interfaceC0594b;
        this.f73i = abstractC0610bArr;
        this.f71g = new Object();
    }

    public c(F3.b bVar, FlutterJNI flutterJNI) {
        this.f70f = 9;
        J1.c cVar = new J1.c(11, this);
        c cVar2 = new c((Object) bVar, "flutter/accessibility", (Object) O3.l.f1771a, 11);
        this.f72h = cVar2;
        bVar.d("flutter/accessibility", new C0673c(cVar2, cVar, false));
        this.f73i = flutterJNI;
    }

    public c(E e4) {
        this.f70f = 4;
        this.f73i = new HashSet();
        this.f71g = e4;
        D3.t tVar = (D3.t) e4;
        z zVar = new z(tVar.getBinaryMessenger());
        J1.c cVar = new J1.c(tVar.getBinaryMessenger());
        C0673c c0673c = new C0673c();
        c0673c.f5969g = new D3.A(0, false);
        c0673c.f5968f = cVar;
        this.f72h = new D[]{zVar, c0673c};
        new M(tVar.getBinaryMessenger()).f401g = this;
    }

    public c(int i7) {
        this.f70f = i7;
        switch (i7) {
            case 21:
                List list = Collections.EMPTY_LIST;
                this.f72h = list;
                this.f73i = list;
                break;
            default:
                this.f72h = new ConcurrentLinkedQueue();
                break;
        }
    }

    public c(Matcher matcher, CharSequence input) {
        this.f70f = 5;
        i.e(input, "input");
        this.f72h = matcher;
        this.f73i = new F5.h(this);
    }

    public c(V5.g gVar) {
        this.f70f = 18;
        this.f72h = gVar;
        this.f73i = new ReentrantLock();
        this.f71g = new WeakHashMap();
    }
}
