package D0;

import D6.z;
import G0.A;
import G0.s;
import K1.o;
import K1.p;
import T6.q;
import T6.v;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
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
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.AbstractServiceC0259z;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.O;
import androidx.lifecycle.S;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import b0.C0265a;
import c1.InterfaceC0289b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.AbstractC0315e;
import com.google.firebase.messaging.AbstractC0316f;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.t;
import g0.AbstractC0421a;
import h4.w;
import h4.x;
import h4.y;
import i.C0509K;
import i.C0511M;
import io.flutter.embedding.engine.FlutterJNI;
import j4.C0573b;
import j4.C0578g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import k0.C0593d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import m4.C0690c;
import n.C0733s;
import n.U;
import n.w1;
import org.json.JSONArray;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;
import p1.C0820c;
import s4.r;
import t1.u;
import u.C0938i;
import u.C0939j;
import y4.C1038g;
import y4.C1040i;
import y4.InterfaceC1039h;
import y4.L;
import y4.M;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class j implements v, K.h, S0.a, InterfaceC0289b, MatchResult, OnCompleteListener, s4.d, InterfaceC1039h {

    /* renamed from: m, reason: collision with root package name */
    public static j f327m;

    /* renamed from: n, reason: collision with root package name */
    public static j f328n;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f329d;

    /* renamed from: e, reason: collision with root package name */
    public Object f330e;

    /* renamed from: i, reason: collision with root package name */
    public Object f331i;

    /* renamed from: l, reason: collision with root package name */
    public Object f332l;

    public /* synthetic */ j(int i2, boolean z7) {
        this.f329d = i2;
    }

    public static j Q() {
        if (f327m == null) {
            q1.h hVar = new q1.h(21);
            g4.a aVar = new g4.a();
            aVar.f5030a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            C0690c c0690c = new C0690c();
            c0690c.f6534a = false;
            c0690c.f6535b = false;
            c0690c.f6539f = flutterJNI;
            c0690c.f6540g = newCachedThreadPool;
            j jVar = new j(19, false);
            jVar.f330e = c0690c;
            jVar.f331i = hVar;
            jVar.f332l = newCachedThreadPool;
            f327m = jVar;
        }
        return f327m;
    }

    public static j R(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public static Object y(p pVar) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return AbstractC1053a.f(pVar, 30L);
        } catch (InterruptedException | TimeoutException e7) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e7);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e8);
        }
    }

    public a1.i A() {
        String str = ((String) this.f330e) == null ? " backendName" : "";
        if (((X0.d) this.f332l) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new a1.i((String) this.f330e, (byte[]) this.f331i, (X0.d) this.f332l);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public SharedPreferences B(C1040i c1040i) {
        Context context = (Context) this.f331i;
        String str = c1040i.f8591a;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            Intrinsics.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        Intrinsics.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void C(int i2, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f331i).dispatchSemanticsAction(i2, dVar);
    }

    public void D(int i2, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f331i).dispatchSemanticsAction(i2, dVar, serializable);
    }

    public void E(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f330e;
        a2.f fVar = new a2.f(byteArrayOutputStream, hashMap, (HashMap) this.f331i, (X1.d) this.f332l);
        X1.d dVar = (X1.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new X1.b("No encoder for " + obj.getClass());
        }
    }

    public int F(int i2, int i5) {
        ArrayList arrayList = (ArrayList) this.f332l;
        int size = arrayList.size();
        while (i5 < size) {
            ((AbstractC0421a) arrayList.get(i5)).getClass();
            i5++;
        }
        return i2;
    }

    public W G(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return H(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public W H(Class modelClass, String key) {
        W viewModel;
        Z z7 = (Z) this.f331i;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        b0 b0Var = (b0) this.f330e;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = b0Var.f3894a;
        W viewModel2 = (W) linkedHashMap.get(key);
        if (!modelClass.isInstance(viewModel2)) {
            b0.d dVar = new b0.d((b0.c) this.f332l);
            dVar.b(X.f3888b, key);
            try {
                viewModel = z7.b(modelClass, dVar);
            } catch (AbstractMethodError unused) {
                viewModel = z7.a(modelClass);
            }
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            W w4 = (W) linkedHashMap.put(key, viewModel);
            if (w4 != null) {
                w4.onCleared();
            }
            return viewModel;
        }
        S s7 = z7 instanceof S ? (S) z7 : null;
        if (s7 != null) {
            Intrinsics.b(viewModel2);
            Intrinsics.checkNotNullParameter(viewModel2, "viewModel");
            AbstractC0250p abstractC0250p = s7.f3880d;
            if (abstractC0250p != null) {
                C0593d c0593d = s7.f3881e;
                Intrinsics.b(c0593d);
                O.a(viewModel2, c0593d, abstractC0250p);
            }
        }
        Intrinsics.c(viewModel2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return viewModel2;
    }

    public ColorStateList I(int i2) {
        int resourceId;
        ColorStateList K7;
        TypedArray typedArray = (TypedArray) this.f331i;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (K7 = O6.g.K((Context) this.f330e, resourceId)) == null) ? typedArray.getColorStateList(i2) : K7;
    }

    public Drawable J(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f331i;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : O6.g.M((Context) this.f330e, resourceId);
    }

    public Drawable K(int i2) {
        int resourceId;
        Drawable d7;
        if (!((TypedArray) this.f331i).hasValue(i2) || (resourceId = ((TypedArray) this.f331i).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0733s a7 = C0733s.a();
        Context context = (Context) this.f330e;
        synchronized (a7) {
            d7 = a7.f6881a.d(context, resourceId, true);
        }
        return d7;
    }

    public Typeface L(int i2, int i5, U u7) {
        U u8;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int i7 = 0;
        int resourceId = ((TypedArray) this.f331i).getResourceId(i2, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f332l) == null) {
                this.f332l = new TypedValue();
            }
            Context context = (Context) this.f330e;
            TypedValue typedValue = (TypedValue) this.f332l;
            ThreadLocal threadLocal = A.m.f35a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    u7.a();
                    return null;
                }
                int i8 = typedValue.assetCookie;
                C0938i c0938i = B.g.f154b;
                Typeface typeface = (Typeface) c0938i.a(B.g.b(resources, resourceId, charSequence2, i8, i5));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new A.j(u7, i7, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e7) {
                    e = e7;
                    u8 = u7;
                } catch (XmlPullParserException e8) {
                    e = e8;
                    u8 = u7;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        int i9 = typedValue.assetCookie;
                        Typeface r7 = B.g.f153a.r(context, resources, resourceId, charSequence2, i5);
                        if (r7 != null) {
                            c0938i.b(B.g.b(resources, resourceId, charSequence2, i9, i5), r7);
                        }
                        if (r7 != null) {
                            new Handler(Looper.getMainLooper()).post(new A.j(u7, i7, r7));
                        } else {
                            u7.a();
                        }
                        return r7;
                    }
                    A.d d7 = A.b.d(resources.getXml(resourceId), resources);
                    if (d7 != null) {
                        return B.g.a(context, d7, resources, resourceId, charSequence2, typedValue.assetCookie, i5, u7);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        u7.a();
                        return null;
                    } catch (IOException e9) {
                        iOException = e9;
                        u8 = u7;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        u8.a();
                        return null;
                    } catch (XmlPullParserException e10) {
                        xmlPullParserException = e10;
                        u8 = u7;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        u8.a();
                        return null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    iOException = e;
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                    u8.a();
                    return null;
                } catch (XmlPullParserException e12) {
                    e = e12;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                    u8.a();
                    return null;
                }
            }
        }
        return null;
    }

    public View M(int i2) {
        return ((RecyclerView) ((l2.c) this.f330e).f6269d).getChildAt(i2);
    }

    public int N() {
        return ((RecyclerView) ((l2.c) this.f330e).f6269d).getChildCount();
    }

    public boolean O(KeyEvent keyEvent) {
        x[] xVarArr = (x[]) this.f330e;
        if (((HashSet) this.f331i).remove(keyEvent)) {
            return false;
        }
        if (xVarArr.length <= 0) {
            S(keyEvent);
            return true;
        }
        w wVar = new w();
        wVar.f5281d = this;
        wVar.f5279b = ((x[]) this.f330e).length;
        wVar.f5278a = false;
        wVar.f5280c = keyEvent;
        for (x xVar : xVarArr) {
            xVar.b(keyEvent, new B6.e(wVar));
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(83:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(80:274|275|(1:24)|25|26|27|(1:29)|271|31|32|(3:246|247|(75:249|(67:251|(1:253)|35|(1:37)|38|(1:40)|41|(2:43|(1:230)(57:47|48|(1:50)|51|(1:53)(2:220|(1:225)(1:224))|(1:55)|56|(1:58)(5:208|(1:210)|211|(1:213)(1:219)|(1:215)(2:216|(1:218)))|59|(1:61)(6:190|(4:193|(2:201|202)(1:199)|200|191)|203|204|(1:206)|207)|62|(1:64)(1:189)|(1:66)|67|(41:185|186|(1:73)|74|(1:76)|77|(35:176|(1:180)|(1:81)|82|(31:171|(1:175)|(1:86)|87|(27:168|(1:170)|(1:91)|92|(23:164|165|(1:96)|97|(3:154|155|(20:157|(1:159)|160|(1:101)|102|(4:139|140|141|(2:143|(14:145|(3:106|(1:111)(1:109)|110)|112|(1:114)|115|(1:117)|118|(1:138)|120|(4:127|128|(1:130)(1:133)|131)|122|(1:124)|125|126)(2:146|147))(2:148|149))|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)(2:161|162))|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|69|(41:181|182|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126))(1:245)|231|(2:240|241)|(1:239)(1:238)|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|254|(70:256|(1:258)|35|(0)|38|(0)|41|(0)(0)|231|(1:233)|240|241|(1:236)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)(1:267)|259|(3:261|(1:263)(1:265)|264)|266|35|(0)|38|(0)|41|(0)(0)|231|(0)|240|241|(0)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126))|34|35|(0)|38|(0)|41|(0)(0)|231|(0)|240|241|(0)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|22|(0)|25|26|27|(0)|271|31|32|(0)|34|35|(0)|38|(0)|41|(0)(0)|231|(0)|240|241|(0)|239|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|94|(0)|97|(0)|99|(0)|102|(0)|104|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x020c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x020d, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00c3, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[Catch: NameNotFoundException -> 0x00c2, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x00c2, blocks: (B:27:0x00b6, B:29:0x00bc), top: B:26:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean P() {
        t tVar;
        FirebaseMessagingService firebaseMessagingService;
        l2.c cVar;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        AtomicInteger atomicInteger;
        String packageName;
        PackageManager packageManager;
        String z7;
        String z8;
        String A7;
        int i2;
        int i5;
        int i7;
        String A8;
        Uri defaultUri;
        String A9;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String A10;
        Integer valueOf;
        String A11;
        Integer x7;
        Integer x8;
        Integer x9;
        String A12;
        Long valueOf2;
        JSONArray y7;
        long[] jArr;
        JSONArray y8;
        int[] iArr;
        String A13;
        IconCompat iconCompat;
        boolean z9;
        int i8;
        ApplicationInfo applicationInfo;
        if (((l2.c) this.f332l).v("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f331i;
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
        String A14 = ((l2.c) this.f332l).A("gcm.n.image");
        if (!TextUtils.isEmpty(A14)) {
            try {
                tVar = new t(new URL(A14));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + A14);
            }
            if (tVar != null) {
                ExecutorService executorService = (ExecutorService) this.f330e;
                K1.h hVar = new K1.h();
                tVar.f4528e = executorService.submit(new A.j(tVar, 17, hVar));
                tVar.f4529i = hVar.f1428a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f331i;
            cVar = (l2.c) this.f332l;
            AtomicInteger atomicInteger2 = AbstractC0316f.f4499a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String A15 = cVar.A("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(A15)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(A15);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + A15 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        atomicInteger = AbstractC0316f.f4499a;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        y.l lVar = new y.l(firebaseMessagingService, A15);
                        z7 = cVar.z(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(z7)) {
                            lVar.f8479e = y.l.b(z7);
                        }
                        z8 = cVar.z(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(z8)) {
                            lVar.f8480f = y.l.b(z8);
                            y.k kVar = new y.k(0);
                            kVar.f8474f = y.l.b(z8);
                            lVar.g(kVar);
                        }
                        A7 = cVar.A("gcm.n.icon");
                        if (TextUtils.isEmpty(A7)) {
                            i2 = 1;
                        } else {
                            i7 = resources.getIdentifier(A7, "drawable", packageName);
                            if ((i7 != 0 && AbstractC0316f.a(resources, i7)) || ((i7 = resources.getIdentifier(A7, "mipmap", packageName)) != 0 && AbstractC0316f.a(resources, i7))) {
                                i2 = 1;
                                lVar.f8495v.icon = i7;
                                A8 = cVar.A("gcm.n.sound2");
                                if (TextUtils.isEmpty(A8)) {
                                    A8 = cVar.A("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(A8)) {
                                    defaultUri = null;
                                } else if ("default".equals(A8) || resources.getIdentifier(A8, "raw", packageName) == 0) {
                                    defaultUri = RingtoneManager.getDefaultUri(2);
                                } else {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + A8);
                                }
                                if (defaultUri != null) {
                                    lVar.f(defaultUri);
                                }
                                A9 = cVar.A("gcm.n.click_action");
                                if (TextUtils.isEmpty(A9)) {
                                    launchIntentForPackage = new Intent(A9);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String A16 = cVar.A("gcm.n.link_android");
                                    if (TextUtils.isEmpty(A16)) {
                                        A16 = cVar.A("gcm.n.link");
                                    }
                                    Uri parse = !TextUtils.isEmpty(A16) ? Uri.parse(A16) : null;
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
                                    Bundle bundle3 = (Bundle) cVar.f6269d;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (cVar.v("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.C());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                lVar.f8481g = activity;
                                broadcast = cVar.v("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.C())), 1140850688);
                                if (broadcast != null) {
                                    lVar.f8495v.deleteIntent = broadcast;
                                }
                                A10 = cVar.A("gcm.n.color");
                                if (!TextUtils.isEmpty(A10)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(A10));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + A10 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        lVar.f8490q = valueOf.intValue();
                                    }
                                    lVar.d(16, !cVar.v("gcm.n.sticky"));
                                    lVar.f8488o = cVar.v("gcm.n.local_only");
                                    A11 = cVar.A("gcm.n.ticker");
                                    if (A11 != null) {
                                        lVar.f8495v.tickerText = y.l.b(A11);
                                    }
                                    x7 = cVar.x("gcm.n.notification_priority");
                                    if (x7 != null) {
                                        if (x7.intValue() < -2 || x7.intValue() > 2) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + x7 + ". Skipping setting notificationPriority.");
                                        }
                                        if (x7 != null) {
                                            lVar.j = x7.intValue();
                                        }
                                        x8 = cVar.x("gcm.n.visibility");
                                        if (x8 != null) {
                                            if (x8.intValue() < -1 || x8.intValue() > i2) {
                                                Log.w("NotificationParams", "visibility is invalid: " + x8 + ". Skipping setting visibility.");
                                            }
                                            if (x8 != null) {
                                                lVar.f8491r = x8.intValue();
                                            }
                                            x9 = cVar.x("gcm.n.notification_count");
                                            if (x9 != null) {
                                                if (x9.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + x9 + ". Skipping setting notificationCount.");
                                                }
                                                if (x9 != null) {
                                                    lVar.f8483i = x9.intValue();
                                                }
                                                A12 = cVar.A("gcm.n.event_time");
                                                if (!TextUtils.isEmpty(A12)) {
                                                    try {
                                                        valueOf2 = Long.valueOf(Long.parseLong(A12));
                                                    } catch (NumberFormatException unused3) {
                                                        Log.w("NotificationParams", "Couldn't parse value of " + l2.c.E("gcm.n.event_time") + "(" + A12 + ") into a long");
                                                    }
                                                    if (valueOf2 != null) {
                                                        lVar.f8484k = true;
                                                        lVar.f8495v.when = valueOf2.longValue();
                                                    }
                                                    y7 = cVar.y("gcm.n.vibrate_timings");
                                                    if (y7 != null) {
                                                        try {
                                                        } catch (NumberFormatException | JSONException unused4) {
                                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + y7 + ". Skipping setting vibrateTimings.");
                                                        }
                                                        if (y7.length() <= 1) {
                                                            throw new JSONException("vibrateTimings have invalid length");
                                                        }
                                                        int length = y7.length();
                                                        jArr = new long[length];
                                                        for (int i9 = 0; i9 < length; i9++) {
                                                            jArr[i9] = y7.optLong(i9);
                                                        }
                                                        if (jArr != null) {
                                                            lVar.f8495v.vibrate = jArr;
                                                        }
                                                        y8 = cVar.y("gcm.n.light_settings");
                                                        if (y8 != null) {
                                                            iArr = new int[3];
                                                            try {
                                                            } catch (IllegalArgumentException e7) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + y8 + ". " + e7.getMessage() + ". Skipping setting LightSettings");
                                                            } catch (JSONException unused5) {
                                                                Log.w("NotificationParams", "LightSettings is invalid: " + y8 + ". Skipping setting LightSettings");
                                                            }
                                                            if (y8.length() != 3) {
                                                                throw new JSONException("lightSettings don't have all three fields");
                                                            }
                                                            int parseColor = Color.parseColor(y8.optString(0));
                                                            if (parseColor == -16777216) {
                                                                throw new IllegalArgumentException("Transparent color is invalid");
                                                            }
                                                            iArr[0] = parseColor;
                                                            iArr[1] = y8.optInt(1);
                                                            iArr[2] = y8.optInt(2);
                                                            if (iArr != null) {
                                                                int i10 = iArr[0];
                                                                int i11 = iArr[1];
                                                                int i12 = iArr[2];
                                                                Notification notification = lVar.f8495v;
                                                                notification.ledARGB = i10;
                                                                notification.ledOnMS = i11;
                                                                notification.ledOffMS = i12;
                                                                notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | ((-2) & notification.flags);
                                                            }
                                                            boolean v7 = cVar.v("gcm.n.default_sound");
                                                            boolean z10 = v7;
                                                            if (cVar.v("gcm.n.default_vibrate_timings")) {
                                                                z10 = (v7 ? 1 : 0) | 2;
                                                            }
                                                            int i13 = z10;
                                                            if (cVar.v("gcm.n.default_light_settings")) {
                                                                i13 = (z10 ? 1 : 0) | 4;
                                                            }
                                                            lVar.c(i13);
                                                            A13 = cVar.A("gcm.n.tag");
                                                            if (TextUtils.isEmpty(A13)) {
                                                                A13 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                            }
                                                            String str2 = A13;
                                                            if (tVar != null) {
                                                                try {
                                                                    p pVar = tVar.f4529i;
                                                                    u.f(pVar);
                                                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                                                    Bitmap bitmap = (Bitmap) AbstractC1053a.f(pVar, 5L);
                                                                    lVar.e(bitmap);
                                                                    y.j jVar = new y.j();
                                                                    if (bitmap == null) {
                                                                        iconCompat = null;
                                                                        z9 = true;
                                                                    } else {
                                                                        z9 = true;
                                                                        iconCompat = new IconCompat(1);
                                                                        iconCompat.f3369b = bitmap;
                                                                    }
                                                                    jVar.f8470e = iconCompat;
                                                                    jVar.f8471f = null;
                                                                    jVar.f8472g = z9;
                                                                    lVar.g(jVar);
                                                                } catch (InterruptedException unused6) {
                                                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                    tVar.close();
                                                                    Thread.currentThread().interrupt();
                                                                } catch (ExecutionException e8) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image: " + e8.getCause());
                                                                } catch (TimeoutException unused7) {
                                                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                    tVar.close();
                                                                }
                                                            }
                                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                                Log.d("FirebaseMessaging", "Showing notification");
                                                            }
                                                            ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str2, 0, lVar.a());
                                                            return true;
                                                        }
                                                        iArr = null;
                                                        if (iArr != null) {
                                                        }
                                                        boolean v72 = cVar.v("gcm.n.default_sound");
                                                        boolean z102 = v72;
                                                        if (cVar.v("gcm.n.default_vibrate_timings")) {
                                                        }
                                                        int i132 = z102;
                                                        if (cVar.v("gcm.n.default_light_settings")) {
                                                        }
                                                        lVar.c(i132);
                                                        A13 = cVar.A("gcm.n.tag");
                                                        if (TextUtils.isEmpty(A13)) {
                                                        }
                                                        String str22 = A13;
                                                        if (tVar != null) {
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str22, 0, lVar.a());
                                                        return true;
                                                    }
                                                    jArr = null;
                                                    if (jArr != null) {
                                                    }
                                                    y8 = cVar.y("gcm.n.light_settings");
                                                    if (y8 != null) {
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean v722 = cVar.v("gcm.n.default_sound");
                                                    boolean z1022 = v722;
                                                    if (cVar.v("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i1322 = z1022;
                                                    if (cVar.v("gcm.n.default_light_settings")) {
                                                    }
                                                    lVar.c(i1322);
                                                    A13 = cVar.A("gcm.n.tag");
                                                    if (TextUtils.isEmpty(A13)) {
                                                    }
                                                    String str222 = A13;
                                                    if (tVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str222, 0, lVar.a());
                                                    return true;
                                                }
                                                valueOf2 = null;
                                                if (valueOf2 != null) {
                                                }
                                                y7 = cVar.y("gcm.n.vibrate_timings");
                                                if (y7 != null) {
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                y8 = cVar.y("gcm.n.light_settings");
                                                if (y8 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean v7222 = cVar.v("gcm.n.default_sound");
                                                boolean z10222 = v7222;
                                                if (cVar.v("gcm.n.default_vibrate_timings")) {
                                                }
                                                int i13222 = z10222;
                                                if (cVar.v("gcm.n.default_light_settings")) {
                                                }
                                                lVar.c(i13222);
                                                A13 = cVar.A("gcm.n.tag");
                                                if (TextUtils.isEmpty(A13)) {
                                                }
                                                String str2222 = A13;
                                                if (tVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str2222, 0, lVar.a());
                                                return true;
                                            }
                                            x9 = null;
                                            if (x9 != null) {
                                            }
                                            A12 = cVar.A("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(A12)) {
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            y7 = cVar.y("gcm.n.vibrate_timings");
                                            if (y7 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            y8 = cVar.y("gcm.n.light_settings");
                                            if (y8 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean v72222 = cVar.v("gcm.n.default_sound");
                                            boolean z102222 = v72222;
                                            if (cVar.v("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i132222 = z102222;
                                            if (cVar.v("gcm.n.default_light_settings")) {
                                            }
                                            lVar.c(i132222);
                                            A13 = cVar.A("gcm.n.tag");
                                            if (TextUtils.isEmpty(A13)) {
                                            }
                                            String str22222 = A13;
                                            if (tVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str22222, 0, lVar.a());
                                            return true;
                                        }
                                        x8 = null;
                                        if (x8 != null) {
                                        }
                                        x9 = cVar.x("gcm.n.notification_count");
                                        if (x9 != null) {
                                        }
                                        x9 = null;
                                        if (x9 != null) {
                                        }
                                        A12 = cVar.A("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(A12)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        y7 = cVar.y("gcm.n.vibrate_timings");
                                        if (y7 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        y8 = cVar.y("gcm.n.light_settings");
                                        if (y8 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean v722222 = cVar.v("gcm.n.default_sound");
                                        boolean z1022222 = v722222;
                                        if (cVar.v("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i1322222 = z1022222;
                                        if (cVar.v("gcm.n.default_light_settings")) {
                                        }
                                        lVar.c(i1322222);
                                        A13 = cVar.A("gcm.n.tag");
                                        if (TextUtils.isEmpty(A13)) {
                                        }
                                        String str222222 = A13;
                                        if (tVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str222222, 0, lVar.a());
                                        return true;
                                    }
                                    x7 = null;
                                    if (x7 != null) {
                                    }
                                    x8 = cVar.x("gcm.n.visibility");
                                    if (x8 != null) {
                                    }
                                    x8 = null;
                                    if (x8 != null) {
                                    }
                                    x9 = cVar.x("gcm.n.notification_count");
                                    if (x9 != null) {
                                    }
                                    x9 = null;
                                    if (x9 != null) {
                                    }
                                    A12 = cVar.A("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(A12)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    y7 = cVar.y("gcm.n.vibrate_timings");
                                    if (y7 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    y8 = cVar.y("gcm.n.light_settings");
                                    if (y8 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean v7222222 = cVar.v("gcm.n.default_sound");
                                    boolean z10222222 = v7222222;
                                    if (cVar.v("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i13222222 = z10222222;
                                    if (cVar.v("gcm.n.default_light_settings")) {
                                    }
                                    lVar.c(i13222222);
                                    A13 = cVar.A("gcm.n.tag");
                                    if (TextUtils.isEmpty(A13)) {
                                    }
                                    String str2222222 = A13;
                                    if (tVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str2222222, 0, lVar.a());
                                    return true;
                                }
                                i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                if (i8 != 0) {
                                    try {
                                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i8));
                                    } catch (Resources.NotFoundException unused8) {
                                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                    if (valueOf != null) {
                                    }
                                    lVar.d(16, !cVar.v("gcm.n.sticky"));
                                    lVar.f8488o = cVar.v("gcm.n.local_only");
                                    A11 = cVar.A("gcm.n.ticker");
                                    if (A11 != null) {
                                    }
                                    x7 = cVar.x("gcm.n.notification_priority");
                                    if (x7 != null) {
                                    }
                                    x7 = null;
                                    if (x7 != null) {
                                    }
                                    x8 = cVar.x("gcm.n.visibility");
                                    if (x8 != null) {
                                    }
                                    x8 = null;
                                    if (x8 != null) {
                                    }
                                    x9 = cVar.x("gcm.n.notification_count");
                                    if (x9 != null) {
                                    }
                                    x9 = null;
                                    if (x9 != null) {
                                    }
                                    A12 = cVar.A("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(A12)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    y7 = cVar.y("gcm.n.vibrate_timings");
                                    if (y7 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    y8 = cVar.y("gcm.n.light_settings");
                                    if (y8 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean v72222222 = cVar.v("gcm.n.default_sound");
                                    boolean z102222222 = v72222222;
                                    if (cVar.v("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i132222222 = z102222222;
                                    if (cVar.v("gcm.n.default_light_settings")) {
                                    }
                                    lVar.c(i132222222);
                                    A13 = cVar.A("gcm.n.tag");
                                    if (TextUtils.isEmpty(A13)) {
                                    }
                                    String str22222222 = A13;
                                    if (tVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str22222222, 0, lVar.a());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                lVar.d(16, !cVar.v("gcm.n.sticky"));
                                lVar.f8488o = cVar.v("gcm.n.local_only");
                                A11 = cVar.A("gcm.n.ticker");
                                if (A11 != null) {
                                }
                                x7 = cVar.x("gcm.n.notification_priority");
                                if (x7 != null) {
                                }
                                x7 = null;
                                if (x7 != null) {
                                }
                                x8 = cVar.x("gcm.n.visibility");
                                if (x8 != null) {
                                }
                                x8 = null;
                                if (x8 != null) {
                                }
                                x9 = cVar.x("gcm.n.notification_count");
                                if (x9 != null) {
                                }
                                x9 = null;
                                if (x9 != null) {
                                }
                                A12 = cVar.A("gcm.n.event_time");
                                if (!TextUtils.isEmpty(A12)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                y7 = cVar.y("gcm.n.vibrate_timings");
                                if (y7 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                y8 = cVar.y("gcm.n.light_settings");
                                if (y8 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean v722222222 = cVar.v("gcm.n.default_sound");
                                boolean z1022222222 = v722222222;
                                if (cVar.v("gcm.n.default_vibrate_timings")) {
                                }
                                int i1322222222 = z1022222222;
                                if (cVar.v("gcm.n.default_light_settings")) {
                                }
                                lVar.c(i1322222222);
                                A13 = cVar.A("gcm.n.tag");
                                if (TextUtils.isEmpty(A13)) {
                                }
                                String str222222222 = A13;
                                if (tVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str222222222, 0, lVar.a());
                                return true;
                            }
                            i2 = 1;
                            Log.w("FirebaseMessaging", "Icon resource " + A7 + " not found. Notification will use default icon.");
                        }
                        i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i5 != 0 || !AbstractC0316f.a(resources, i5)) {
                            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i7 = (i5 == 0 && AbstractC0316f.a(resources, i5)) ? i5 : 17301651;
                        lVar.f8495v.icon = i7;
                        A8 = cVar.A("gcm.n.sound2");
                        if (TextUtils.isEmpty(A8)) {
                        }
                        if (!TextUtils.isEmpty(A8)) {
                        }
                        if (defaultUri != null) {
                        }
                        A9 = cVar.A("gcm.n.click_action");
                        if (TextUtils.isEmpty(A9)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        lVar.f8481g = activity;
                        if (cVar.v("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        A10 = cVar.A("gcm.n.color");
                        if (!TextUtils.isEmpty(A10)) {
                        }
                        i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i8 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        lVar.d(16, !cVar.v("gcm.n.sticky"));
                        lVar.f8488o = cVar.v("gcm.n.local_only");
                        A11 = cVar.A("gcm.n.ticker");
                        if (A11 != null) {
                        }
                        x7 = cVar.x("gcm.n.notification_priority");
                        if (x7 != null) {
                        }
                        x7 = null;
                        if (x7 != null) {
                        }
                        x8 = cVar.x("gcm.n.visibility");
                        if (x8 != null) {
                        }
                        x8 = null;
                        if (x8 != null) {
                        }
                        x9 = cVar.x("gcm.n.notification_count");
                        if (x9 != null) {
                        }
                        x9 = null;
                        if (x9 != null) {
                        }
                        A12 = cVar.A("gcm.n.event_time");
                        if (!TextUtils.isEmpty(A12)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        y7 = cVar.y("gcm.n.vibrate_timings");
                        if (y7 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        y8 = cVar.y("gcm.n.light_settings");
                        if (y8 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean v7222222222 = cVar.v("gcm.n.default_sound");
                        boolean z10222222222 = v7222222222;
                        if (cVar.v("gcm.n.default_vibrate_timings")) {
                        }
                        int i13222222222 = z10222222222;
                        if (cVar.v("gcm.n.default_light_settings")) {
                        }
                        lVar.c(i13222222222);
                        A13 = cVar.A("gcm.n.tag");
                        if (TextUtils.isEmpty(A13)) {
                        }
                        String str2222222222 = A13;
                        if (tVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str2222222222, 0, lVar.a());
                        return true;
                    }
                    A15 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(A15)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(A15);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        atomicInteger = AbstractC0316f.f4499a;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        y.l lVar2 = new y.l(firebaseMessagingService, A15);
                        z7 = cVar.z(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(z7)) {
                        }
                        z8 = cVar.z(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(z8)) {
                        }
                        A7 = cVar.A("gcm.n.icon");
                        if (TextUtils.isEmpty(A7)) {
                        }
                        i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i5 != 0) {
                        }
                        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i5 == 0) {
                        }
                        lVar2.f8495v.icon = i7;
                        A8 = cVar.A("gcm.n.sound2");
                        if (TextUtils.isEmpty(A8)) {
                        }
                        if (!TextUtils.isEmpty(A8)) {
                        }
                        if (defaultUri != null) {
                        }
                        A9 = cVar.A("gcm.n.click_action");
                        if (TextUtils.isEmpty(A9)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        lVar2.f8481g = activity;
                        if (cVar.v("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        A10 = cVar.A("gcm.n.color");
                        if (!TextUtils.isEmpty(A10)) {
                        }
                        i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i8 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        lVar2.d(16, !cVar.v("gcm.n.sticky"));
                        lVar2.f8488o = cVar.v("gcm.n.local_only");
                        A11 = cVar.A("gcm.n.ticker");
                        if (A11 != null) {
                        }
                        x7 = cVar.x("gcm.n.notification_priority");
                        if (x7 != null) {
                        }
                        x7 = null;
                        if (x7 != null) {
                        }
                        x8 = cVar.x("gcm.n.visibility");
                        if (x8 != null) {
                        }
                        x8 = null;
                        if (x8 != null) {
                        }
                        x9 = cVar.x("gcm.n.notification_count");
                        if (x9 != null) {
                        }
                        x9 = null;
                        if (x9 != null) {
                        }
                        A12 = cVar.A("gcm.n.event_time");
                        if (!TextUtils.isEmpty(A12)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        y7 = cVar.y("gcm.n.vibrate_timings");
                        if (y7 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        y8 = cVar.y("gcm.n.light_settings");
                        if (y8 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean v72222222222 = cVar.v("gcm.n.default_sound");
                        boolean z102222222222 = v72222222222;
                        if (cVar.v("gcm.n.default_vibrate_timings")) {
                        }
                        int i132222222222 = z102222222222;
                        if (cVar.v("gcm.n.default_light_settings")) {
                        }
                        lVar2.c(i132222222222);
                        A13 = cVar.A("gcm.n.tag");
                        if (TextUtils.isEmpty(A13)) {
                        }
                        String str22222222222 = A13;
                        if (tVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str22222222222, 0, lVar2.a());
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
                        notificationManager.createNotificationChannel(AbstractC0315e.e(string));
                    }
                    A15 = "fcm_fallback_notification_channel";
                    atomicInteger = AbstractC0316f.f4499a;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    y.l lVar22 = new y.l(firebaseMessagingService, A15);
                    z7 = cVar.z(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(z7)) {
                    }
                    z8 = cVar.z(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(z8)) {
                    }
                    A7 = cVar.A("gcm.n.icon");
                    if (TextUtils.isEmpty(A7)) {
                    }
                    i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i5 != 0) {
                    }
                    i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i5 == 0) {
                    }
                    lVar22.f8495v.icon = i7;
                    A8 = cVar.A("gcm.n.sound2");
                    if (TextUtils.isEmpty(A8)) {
                    }
                    if (!TextUtils.isEmpty(A8)) {
                    }
                    if (defaultUri != null) {
                    }
                    A9 = cVar.A("gcm.n.click_action");
                    if (TextUtils.isEmpty(A9)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    lVar22.f8481g = activity;
                    if (cVar.v("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    A10 = cVar.A("gcm.n.color");
                    if (!TextUtils.isEmpty(A10)) {
                    }
                    i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i8 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    lVar22.d(16, !cVar.v("gcm.n.sticky"));
                    lVar22.f8488o = cVar.v("gcm.n.local_only");
                    A11 = cVar.A("gcm.n.ticker");
                    if (A11 != null) {
                    }
                    x7 = cVar.x("gcm.n.notification_priority");
                    if (x7 != null) {
                    }
                    x7 = null;
                    if (x7 != null) {
                    }
                    x8 = cVar.x("gcm.n.visibility");
                    if (x8 != null) {
                    }
                    x8 = null;
                    if (x8 != null) {
                    }
                    x9 = cVar.x("gcm.n.notification_count");
                    if (x9 != null) {
                    }
                    x9 = null;
                    if (x9 != null) {
                    }
                    A12 = cVar.A("gcm.n.event_time");
                    if (!TextUtils.isEmpty(A12)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    y7 = cVar.y("gcm.n.vibrate_timings");
                    if (y7 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    y8 = cVar.y("gcm.n.light_settings");
                    if (y8 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean v722222222222 = cVar.v("gcm.n.default_sound");
                    boolean z1022222222222 = v722222222222;
                    if (cVar.v("gcm.n.default_vibrate_timings")) {
                    }
                    int i1322222222222 = z1022222222222;
                    if (cVar.v("gcm.n.default_light_settings")) {
                    }
                    lVar22.c(i1322222222222);
                    A13 = cVar.A("gcm.n.tag");
                    if (TextUtils.isEmpty(A13)) {
                    }
                    String str222222222222 = A13;
                    if (tVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str222222222222, 0, lVar22.a());
                    return true;
                }
            }
            A15 = null;
            atomicInteger = AbstractC0316f.f4499a;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            y.l lVar222 = new y.l(firebaseMessagingService, A15);
            z7 = cVar.z(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(z7)) {
            }
            z8 = cVar.z(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(z8)) {
            }
            A7 = cVar.A("gcm.n.icon");
            if (TextUtils.isEmpty(A7)) {
            }
            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i5 != 0) {
            }
            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i5 == 0) {
            }
            lVar222.f8495v.icon = i7;
            A8 = cVar.A("gcm.n.sound2");
            if (TextUtils.isEmpty(A8)) {
            }
            if (!TextUtils.isEmpty(A8)) {
            }
            if (defaultUri != null) {
            }
            A9 = cVar.A("gcm.n.click_action");
            if (TextUtils.isEmpty(A9)) {
            }
            if (launchIntentForPackage != null) {
            }
            lVar222.f8481g = activity;
            if (cVar.v("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            A10 = cVar.A("gcm.n.color");
            if (!TextUtils.isEmpty(A10)) {
            }
            i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i8 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            lVar222.d(16, !cVar.v("gcm.n.sticky"));
            lVar222.f8488o = cVar.v("gcm.n.local_only");
            A11 = cVar.A("gcm.n.ticker");
            if (A11 != null) {
            }
            x7 = cVar.x("gcm.n.notification_priority");
            if (x7 != null) {
            }
            x7 = null;
            if (x7 != null) {
            }
            x8 = cVar.x("gcm.n.visibility");
            if (x8 != null) {
            }
            x8 = null;
            if (x8 != null) {
            }
            x9 = cVar.x("gcm.n.notification_count");
            if (x9 != null) {
            }
            x9 = null;
            if (x9 != null) {
            }
            A12 = cVar.A("gcm.n.event_time");
            if (!TextUtils.isEmpty(A12)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            y7 = cVar.y("gcm.n.vibrate_timings");
            if (y7 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            y8 = cVar.y("gcm.n.light_settings");
            if (y8 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean v7222222222222 = cVar.v("gcm.n.default_sound");
            boolean z10222222222222 = v7222222222222;
            if (cVar.v("gcm.n.default_vibrate_timings")) {
            }
            int i13222222222222 = z10222222222222;
            if (cVar.v("gcm.n.default_light_settings")) {
            }
            lVar222.c(i13222222222222);
            A13 = cVar.A("gcm.n.tag");
            if (TextUtils.isEmpty(A13)) {
            }
            String str2222222222222 = A13;
            if (tVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str2222222222222, 0, lVar222.a());
            return true;
        }
        tVar = null;
        if (tVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f331i;
        cVar = (l2.c) this.f332l;
        AtomicInteger atomicInteger22 = AbstractC0316f.f4499a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String A152 = cVar.A("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        A152 = null;
        atomicInteger = AbstractC0316f.f4499a;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        y.l lVar2222 = new y.l(firebaseMessagingService, A152);
        z7 = cVar.z(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(z7)) {
        }
        z8 = cVar.z(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(z8)) {
        }
        A7 = cVar.A("gcm.n.icon");
        if (TextUtils.isEmpty(A7)) {
        }
        i5 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i5 != 0) {
        }
        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i5 == 0) {
        }
        lVar2222.f8495v.icon = i7;
        A8 = cVar.A("gcm.n.sound2");
        if (TextUtils.isEmpty(A8)) {
        }
        if (!TextUtils.isEmpty(A8)) {
        }
        if (defaultUri != null) {
        }
        A9 = cVar.A("gcm.n.click_action");
        if (TextUtils.isEmpty(A9)) {
        }
        if (launchIntentForPackage != null) {
        }
        lVar2222.f8481g = activity;
        if (cVar.v("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        A10 = cVar.A("gcm.n.color");
        if (!TextUtils.isEmpty(A10)) {
        }
        i8 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i8 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        lVar2222.d(16, !cVar.v("gcm.n.sticky"));
        lVar2222.f8488o = cVar.v("gcm.n.local_only");
        A11 = cVar.A("gcm.n.ticker");
        if (A11 != null) {
        }
        x7 = cVar.x("gcm.n.notification_priority");
        if (x7 != null) {
        }
        x7 = null;
        if (x7 != null) {
        }
        x8 = cVar.x("gcm.n.visibility");
        if (x8 != null) {
        }
        x8 = null;
        if (x8 != null) {
        }
        x9 = cVar.x("gcm.n.notification_count");
        if (x9 != null) {
        }
        x9 = null;
        if (x9 != null) {
        }
        A12 = cVar.A("gcm.n.event_time");
        if (!TextUtils.isEmpty(A12)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        y7 = cVar.y("gcm.n.vibrate_timings");
        if (y7 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        y8 = cVar.y("gcm.n.light_settings");
        if (y8 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean v72222222222222 = cVar.v("gcm.n.default_sound");
        boolean z102222222222222 = v72222222222222;
        if (cVar.v("gcm.n.default_vibrate_timings")) {
        }
        int i132222222222222 = z102222222222222;
        if (cVar.v("gcm.n.default_light_settings")) {
        }
        lVar2222.c(i132222222222222);
        A13 = cVar.A("gcm.n.tag");
        if (TextUtils.isEmpty(A13)) {
        }
        String str22222222222222 = A13;
        if (tVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f331i).getSystemService("notification")).notify(str22222222222222, 0, lVar2222.a());
        return true;
    }

    public void S(KeyEvent keyEvent) {
        InputConnection inputConnection;
        HashSet hashSet = (HashSet) this.f331i;
        y yVar = (y) this.f332l;
        if (yVar != null) {
            io.flutter.plugin.editing.i iVar = ((h4.p) yVar).f5253t;
            boolean z7 = false;
            if (iVar.f5654b.isAcceptingText() && (inputConnection = iVar.j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.c) {
                    io.flutter.plugin.editing.c cVar = (io.flutter.plugin.editing.c) inputConnection;
                    io.flutter.plugin.editing.f fVar = cVar.f5618d;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z7 = cVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z7 = cVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z7 = cVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z7 = cVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = cVar.f5619e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    cVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z7 = true;
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
                                int i2 = min + 1;
                                cVar.setSelection(i2, i2);
                                cVar.endBatchEdit();
                                z7 = true;
                            }
                        }
                    }
                } else {
                    z7 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z7) {
                return;
            }
            hashSet.add(keyEvent);
            ((h4.p) yVar).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void T(Activity activity, A0.l newLayoutInfo) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f332l;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f331i;
        reentrantLock.lock();
        try {
            if (newLayoutInfo.equals((A0.l) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            l2.c cVar = (l2.c) this.f330e;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
            Iterator it = ((n) cVar.f6269d).f347b.iterator();
            while (it.hasNext()) {
                m this$0 = (m) it.next();
                if (this$0.f341a.equals(activity)) {
                    Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                    this$0.f343c = newLayoutInfo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                    this$0.f342b.accept(newLayoutInfo);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void U(String str, String str2, String str3, String str4) {
        P1.g gVar = (P1.g) this.f331i;
        if (str2 == null || str3 == null) {
            throw new IOException("FIS auth token or FIS ID is empty");
        }
        gVar.a();
        P1.h hVar = gVar.f2272c;
        String str5 = hVar.f2286h;
        gVar.a();
        String str6 = hVar.f2279a;
        if (str5 == null) {
            throw new IOException("Project ID or API Key is missing");
        }
        URL url = new URL("https://fcmregistrations.googleapis.com/v1/projects/" + str5 + "/registrations/" + str3 + "/topicSubscriptions/" + str + ":" + str4);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Topic " + str4 + " for: " + str + " with url: " + url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Topic " + str4 + " for: " + str + " succeeded.");
                        return;
                    }
                    return;
                }
                if (responseCode != 404 && responseCode != 403) {
                    if (responseCode >= 500) {
                        throw new IOException("INTERNAL_SERVER_ERROR");
                    }
                    throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + httpURLConnection.getResponseMessage());
                }
                throw new IOException("Topic " + str4 + " failed: " + httpURLConnection.getResponseMessage());
            } catch (IOException e7) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e7);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void V(EnumC0248n enumC0248n) {
        androidx.lifecycle.U u7 = (androidx.lifecycle.U) this.f332l;
        if (u7 != null) {
            u7.run();
        }
        androidx.lifecycle.U u8 = new androidx.lifecycle.U((C0258y) this.f330e, enumC0248n);
        this.f332l = u8;
        ((Handler) this.f331i).postAtFrontOfQueue(u8);
    }

    public void W() {
        ((TypedArray) this.f331i).recycle();
    }

    public void X(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0421a instance = (AbstractC0421a) arrayList.get(i2);
            instance.getClass();
            B6.p pVar = (B6.p) this.f330e;
            Object[] objArr = (Object[]) pVar.f234c;
            Intrinsics.checkNotNullParameter(instance, "instance");
            int i5 = pVar.f233b;
            for (int i7 = 0; i7 < i5; i7++) {
                if (objArr[i7] == instance) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i8 = pVar.f233b;
            if (i8 < objArr.length) {
                objArr[i8] = instance;
                pVar.f233b = i8 + 1;
            }
        }
        arrayList.clear();
    }

    public void Y(Collection workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f332l) {
            try {
                for (M0.b bVar : (M0.b[]) this.f331i) {
                    if (bVar.f1724e != null) {
                        bVar.f1724e = null;
                        bVar.d(null, bVar.f1723d);
                    }
                }
                for (M0.b bVar2 : (M0.b[]) this.f331i) {
                    bVar2.c(workSpecs);
                }
                for (M0.b bVar3 : (M0.b[]) this.f331i) {
                    if (bVar3.f1724e != this) {
                        bVar3.f1724e = this;
                        bVar3.d(this, bVar3.f1723d);
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Z() {
        synchronized (this.f332l) {
            try {
                for (M0.b bVar : (M0.b[]) this.f331i) {
                    ArrayList arrayList = bVar.f1721b;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        bVar.f1720a.b(bVar);
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T6.v
    public T6.w a() {
        return (q) this.f331i;
    }

    public void a0(X0.a aVar) {
        A4.c cVar = new A4.c(22);
        a1.p pVar = (a1.p) this.f332l;
        a1.i iVar = (a1.i) this.f330e;
        X0.c cVar2 = (X0.c) this.f331i;
        f1.c cVar3 = pVar.f3081c;
        j a7 = a1.i.a();
        a7.b0(iVar.f3067a);
        a7.f332l = X0.d.f2851d;
        a7.f331i = iVar.f3068b;
        a1.i A7 = a7.A();
        z zVar = new z(3);
        zVar.f644g = new HashMap();
        zVar.f642e = Long.valueOf(pVar.f3079a.d());
        zVar.f643f = Long.valueOf(pVar.f3080b.d());
        zVar.f639b = "FCM_CLIENT_EVENT_LOGGING";
        k2.e eVar = aVar.f2847a;
        j jVar = com.google.firebase.messaging.u.f4530a;
        jVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            jVar.E(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        zVar.f641d = new a1.l(cVar2, byteArrayOutputStream.toByteArray());
        zVar.f640c = null;
        f1.b bVar = (f1.b) cVar3;
        bVar.f4769b.execute(new B5.b(bVar, A7, cVar, zVar.i()));
    }

    @Override // y4.InterfaceC1039h
    public void b(String key, double d7, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d7).apply();
    }

    public void b0(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f330e = str;
    }

    @Override // y4.InterfaceC1039h
    public void c(String key, String value, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, value).apply();
    }

    public void c0(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ((P0.p) this.f331i).f2226g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((P0.p) this.f331i).f2226g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    @Override // y4.InterfaceC1039h
    public String d(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        if (B7.contains(key)) {
            return B7.getString(key, "");
        }
        return null;
    }

    @Override // y4.InterfaceC1039h
    public Boolean e(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        if (B7.contains(key)) {
            return Boolean.valueOf(B7.getBoolean(key, true));
        }
        return null;
    }

    @Override // y4.InterfaceC1039h
    public y4.O f(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        if (!B7.contains(key)) {
            return null;
        }
        String string = B7.getString(key, "");
        Intrinsics.b(string);
        return kotlin.text.p.l(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new y4.O(string, M.f8573l) : kotlin.text.p.l(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new y4.O(null, M.f8572i) : new y4.O(null, M.f8574m);
    }

    @Override // s4.d
    public void g(ByteBuffer byteBuffer, C0578g c0578g) {
        AtomicReference atomicReference = (AtomicReference) this.f331i;
        s4.h hVar = (s4.h) this.f330e;
        s4.i iVar = (s4.i) this.f332l;
        String str = iVar.f7761b;
        r rVar = iVar.f7762c;
        String str2 = rVar.e(byteBuffer).f7767a;
        if (!str2.equals("listen")) {
            if (!str2.equals("cancel")) {
                c0578g.a(null);
                return;
            }
            if (((s4.g) atomicReference.getAndSet(null)) == null) {
                c0578g.a(rVar.d("error", "No active stream to cancel", null));
                return;
            }
            try {
                f4.a aVar = (f4.a) hVar;
                N0.h hVar2 = aVar.f4802d;
                if (hVar2 != null) {
                    ((ConnectivityManager) aVar.f4799a.f6269d).unregisterNetworkCallback(hVar2);
                    aVar.f4802d = null;
                }
                c0578g.a(rVar.a(null));
                return;
            } catch (RuntimeException e7) {
                Log.e("EventChannel#" + str, "Failed to close event stream", e7);
                c0578g.a(rVar.d("error", e7.getMessage(), null));
                return;
            }
        }
        s4.g gVar = new s4.g(this);
        if (((s4.g) atomicReference.getAndSet(gVar)) != null) {
            try {
                f4.a aVar2 = (f4.a) hVar;
                N0.h hVar3 = aVar2.f4802d;
                if (hVar3 != null) {
                    ((ConnectivityManager) aVar2.f4799a.f6269d).unregisterNetworkCallback(hVar3);
                    aVar2.f4802d = null;
                }
            } catch (RuntimeException e8) {
                Log.e("EventChannel#" + str, "Failed to close existing event stream", e8);
            }
        }
        try {
            f4.a aVar3 = (f4.a) hVar;
            aVar3.f4800b = gVar;
            N0.h hVar4 = new N0.h(1, aVar3);
            aVar3.f4802d = hVar4;
            l2.c cVar = aVar3.f4799a;
            ((ConnectivityManager) cVar.f6269d).registerDefaultNetworkCallback(hVar4);
            ConnectivityManager connectivityManager = (ConnectivityManager) cVar.f6269d;
            aVar3.f4801c.post(new A.j(aVar3, 21, l2.c.w(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
            c0578g.a(rVar.a(null));
        } catch (RuntimeException e9) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str, "Failed to open event stream", e9);
            c0578g.a(rVar.d("error", e9.getMessage(), null));
        }
    }

    @Override // Q5.a
    public Object get() {
        switch (this.f329d) {
            case 10:
                return new a1.p(new q1.h(22), new c2.e(), (f1.c) ((D6.y) this.f330e).get(), (g1.i) ((w1) this.f331i).get(), (g1.j) ((com.google.firebase.messaging.z) this.f332l).get());
            default:
                return new g1.c((Context) ((Q5.a) this.f330e).get(), (h1.d) ((Q5.a) this.f331i).get(), (g1.a) ((q1.h) this.f332l).get());
        }
    }

    @Override // K.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.f331i;
    }

    @Override // y4.InterfaceC1039h
    public Long h(String key, C1040i options) {
        long j;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        if (!B7.contains(key)) {
            return null;
        }
        try {
            j = B7.getLong(key, 0L);
        } catch (ClassCastException unused) {
            j = B7.getInt(key, 0);
        }
        return Long.valueOf(j);
    }

    @Override // y4.InterfaceC1039h
    public Map i(List list, C1040i options) {
        Object value;
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ?> all = B(options).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (L.b(entry.getKey(), entry.getValue(), list != null ? CollectionsKt.C(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c7 = L.c(value, (r4.d) this.f332l);
                Intrinsics.c(c7, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c7);
            }
        }
        return hashMap;
    }

    @Override // y4.InterfaceC1039h
    public void j(String key, long j, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putLong(key, j).apply();
    }

    @Override // y4.InterfaceC1039h
    public void k(List list, C1040i options) {
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        SharedPreferences.Editor edit = B7.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "edit(...)");
        Map<String, ?> all = B7.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (L.b(str, all.get(str), list != null ? CollectionsKt.C(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // K.h
    public Object l() {
        return null;
    }

    @Override // K.h
    public Uri m() {
        return (Uri) this.f330e;
    }

    @Override // y4.InterfaceC1039h
    public void o(String key, boolean z7, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putBoolean(key, z7).apply();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        C0820c c0820c = (C0820c) this.f330e;
        String str = (String) this.f331i;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f332l;
        C0939j c0939j = c0820c.f7162a;
        synchronized (c0939j) {
            c0939j.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // K.h
    public Uri p() {
        return (Uri) this.f332l;
    }

    @Override // y4.InterfaceC1039h
    public Double q(String key, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        if (!B7.contains(key)) {
            return null;
        }
        Object c7 = L.c(B7.getString(key, ""), (r4.d) this.f332l);
        Intrinsics.c(c7, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c7;
    }

    @Override // y4.InterfaceC1039h
    public List s(List list, C1040i options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ?> all = B(options).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            if (L.b(key, entry.getValue(), list != null ? CollectionsKt.C(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.z(linkedHashMap.keySet());
    }

    @Override // y4.InterfaceC1039h
    public void t(String key, String value, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, value).apply();
    }

    public String toString() {
        switch (this.f329d) {
            case 18:
                return ((J6.a) this.f331i).toString() + ", hidden list:" + ((ArrayList) this.f332l).size();
            default:
                return super.toString();
        }
    }

    @Override // T6.v
    public T6.u u() {
        return (T6.p) this.f332l;
    }

    @Override // y4.InterfaceC1039h
    public void v(String key, List value, C1040i options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, r4.f.i("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", ((r4.d) this.f332l).a(value))).apply();
    }

    @Override // y4.InterfaceC1039h
    public ArrayList w(String key, C1040i options) {
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences B7 = B(options);
        if (!B7.contains(key)) {
            return null;
        }
        String string = B7.getString(key, "");
        Intrinsics.b(string);
        if (!kotlin.text.p.l(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || kotlin.text.p.l(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || (list = (List) L.c(B7.getString(key, ""), (r4.d) this.f332l)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean x(String workSpecId) {
        M0.b bVar;
        boolean z7;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f332l) {
            try {
                M0.b[] bVarArr = (M0.b[]) this.f331i;
                int length = bVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i2];
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                    Object obj = bVar.f1723d;
                    if (obj != null && bVar.b(obj) && bVar.f1722c.contains(workSpecId)) {
                        break;
                    }
                    i2++;
                }
                if (bVar != null) {
                    s.d().a(L0.c.f1660a, "Work " + workSpecId + " constrained by " + bVar.getClass().getSimpleName());
                }
                z7 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public G0.u z() {
        Intrinsics.checkNotNullParameter(this, "builder");
        G0.u uVar = new G0.u((UUID) this.f330e, (P0.p) this.f331i, (LinkedHashSet) this.f332l);
        G0.e eVar = ((P0.p) this.f331i).j;
        boolean z7 = !eVar.f801h.isEmpty() || eVar.f797d || eVar.f795b || eVar.f796c;
        P0.p pVar = (P0.p) this.f331i;
        if (pVar.f2235q) {
            if (z7) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f2226g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID id = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID()");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f330e = id;
        String newId = id.toString();
        Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
        P0.p other = (P0.p) this.f331i;
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
        String str = other.f2222c;
        A a7 = other.f2221b;
        String str2 = other.f2223d;
        G0.h hVar = new G0.h(other.f2224e);
        G0.h hVar2 = new G0.h(other.f2225f);
        long j = other.f2226g;
        long j7 = other.f2227h;
        long j8 = other.f2228i;
        G0.e other2 = other.j;
        Intrinsics.checkNotNullParameter(other2, "other");
        this.f331i = new P0.p(newId, a7, str, str2, hVar, hVar2, j, j7, j8, new G0.e(other2.f794a, other2.f795b, other2.f796c, other2.f797d, other2.f798e, other2.f799f, other2.f800g, other2.f801h), other.f2229k, other.f2230l, other.f2231m, other.f2232n, other.f2233o, other.f2234p, other.f2235q, other.f2236r, other.f2237s, 524288, 0);
        return uVar;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i2) {
        this.f329d = i2;
        this.f330e = obj;
        this.f331i = obj2;
        this.f332l = obj3;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i2, boolean z7) {
        this.f329d = i2;
        this.f330e = obj3;
        this.f331i = obj;
        this.f332l = obj2;
    }

    public j(AbstractServiceC0259z provider) {
        this.f329d = 12;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f330e = new C0258y(provider);
        this.f331i = new Handler();
    }

    public j(P0.n nVar) {
        this.f329d = 3;
        this.f330e = nVar;
        this.f331i = T6.b.b((U6.d) nVar.f2216l);
        U6.c cVar = (U6.c) nVar.f2217m;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        this.f332l = new T6.p(cVar);
    }

    public j(a1.i iVar, X0.c cVar, A4.c cVar2, a1.p pVar) {
        this.f329d = 9;
        this.f330e = iVar;
        this.f331i = cVar;
        this.f332l = pVar;
    }

    public j(Class workerClass) {
        this.f329d = 1;
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        this.f330e = randomUUID;
        String id = ((UUID) this.f330e).toString();
        Intrinsics.checkNotNullExpressionValue(id, "id.toString()");
        String workerClassName_ = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
        this.f331i = new P0.p(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
        String name = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
        String[] elements = {name};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet destination = new LinkedHashSet(H.a(1));
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.add(elements[0]);
        this.f332l = destination;
        ((P0.p) this.f331i).f2223d = OverwritingInputMerger.class.getName();
    }

    public j(ExecutorService executorService) {
        this.f329d = 6;
        this.f331i = new Handler(Looper.getMainLooper());
        this.f332l = new o(1, this);
        this.f330e = new Q0.m(executorService);
    }

    public j(b0 store, Z factory, b0.c defaultCreationExtras) {
        this.f329d = 13;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f330e = store;
        this.f331i = factory;
        this.f332l = defaultCreationExtras;
    }

    @Override // K.h
    public void n() {
    }

    public j(l2.c cVar, byte b7) {
        this.f329d = 18;
        this.f330e = cVar;
        this.f331i = new J6.a();
        this.f332l = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(b0 store, Z factory) {
        this(store, factory, C0265a.f4133b);
        this.f329d = 13;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public j(Context context, TypedArray typedArray) {
        this.f329d = 23;
        this.f330e = context;
        this.f331i = typedArray;
    }

    public j(Context context, LocationManager locationManager) {
        this.f329d = 21;
        this.f332l = new C0509K();
        this.f330e = context;
        this.f331i = locationManager;
    }

    public j(P0.i trackers, L0.b bVar) {
        this.f329d = 5;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        N0.a tracker = (N0.a) trackers.f2200a;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        M0.a aVar = new M0.a(tracker, 0);
        N0.a tracker2 = (N0.a) trackers.f2201b;
        Intrinsics.checkNotNullParameter(tracker2, "tracker");
        M0.a aVar2 = new M0.a(tracker2, 1);
        N0.a tracker3 = (N0.a) trackers.f2203d;
        Intrinsics.checkNotNullParameter(tracker3, "tracker");
        M0.a aVar3 = new M0.a(tracker3, 4);
        N0.i tracker4 = (N0.i) trackers.f2202c;
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        M0.a aVar4 = new M0.a(tracker4, 2);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        M0.a aVar5 = new M0.a(tracker4, 3);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        M0.d dVar = new M0.d(tracker4);
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        M0.b[] constraintControllers = {aVar, aVar2, aVar3, aVar4, aVar5, dVar, new M0.c(tracker4)};
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.f330e = bVar;
        this.f331i = constraintControllers;
        this.f332l = new Object();
    }

    public j(c2.e eVar) {
        this.f329d = 17;
        this.f330e = new B6.p(30);
        this.f331i = new ArrayList();
        this.f332l = new ArrayList();
        new q1.h(17, this);
    }

    public j(C0573b c0573b, FlutterJNI flutterJNI) {
        this.f329d = 25;
        l4.b bVar = new l4.b(6, this);
        P0.i iVar = new P0.i(c0573b, "flutter/accessibility", s4.v.f7772a, null);
        this.f330e = iVar;
        iVar.m(bVar);
        this.f331i = flutterJNI;
    }

    public j(y yVar) {
        this.f329d = 20;
        this.f331i = new HashSet();
        this.f332l = yVar;
        h4.p pVar = (h4.p) yVar;
        h4.u uVar = new h4.u(pVar.getBinaryMessenger());
        l4.b bVar = new l4.b(pVar.getBinaryMessenger());
        P0.s sVar = new P0.s();
        sVar.f2252e = new h4.v(0);
        sVar.f2251d = bVar;
        this.f330e = new x[]{uVar, sVar};
        new C0511M(pVar.getBinaryMessenger()).f5381e = this;
    }

    public j(s4.i iVar, s4.h hVar) {
        this.f329d = 27;
        this.f332l = iVar;
        this.f331i = new AtomicReference(null);
        this.f330e = hVar;
    }

    public j(int i2) {
        this.f329d = i2;
        switch (i2) {
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                this.f330e = new ConcurrentLinkedQueue();
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f330e = list;
                this.f331i = list;
                break;
        }
    }

    public j(s4.f messenger, Context context, r4.d listEncoder) {
        this.f329d = 29;
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        this.f330e = messenger;
        this.f331i = context;
        this.f332l = listEncoder;
        try {
            InterfaceC1039h.j.getClass();
            C1038g.b(messenger, this, "shared_preferences");
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e7);
        }
    }

    public j(l2.c callbackInterface) {
        this.f329d = 0;
        Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
        this.f330e = callbackInterface;
        this.f331i = new ReentrantLock();
        this.f332l = new WeakHashMap();
    }

    public j(Matcher matcher, CharSequence input) {
        this.f329d = 22;
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f330e = matcher;
        this.f331i = new kotlin.text.g(this);
    }
}
