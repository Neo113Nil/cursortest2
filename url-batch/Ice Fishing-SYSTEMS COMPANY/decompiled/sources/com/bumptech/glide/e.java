package com.bumptech.glide;

import D0.x;
import J0.s;
import O.InterfaceC0348j;
import O.W;
import O.X;
import a.AbstractC0415a;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.icefishing.icefishingliveapp.C5284R;
import e8.q;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import q7.C4938g;
import q7.C4941j;
import q7.C4942k;
import q7.C4950s;
import q7.EnumC4937f;
import q7.InterfaceC4936e;
import q7.w;
import r7.t;
import t.AbstractC5016g;
import t.C5012c;
import t.C5015f;
import t0.AbstractC5051n;
import v7.C5131b;
import v7.C5139j;
import v7.InterfaceC5136g;
import v7.InterfaceC5137h;
import v7.InterfaceC5138i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f23537b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23538c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Method f23539d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f23540e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Field f23541f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23542a;

    public /* synthetic */ e(int i) {
        this.f23542a = i;
    }

    public static void B(ViewGroup viewGroup, boolean z8) {
        if (Build.VERSION.SDK_INT >= 29) {
            x.b(viewGroup, z8);
        } else if (f23537b) {
            try {
                x.b(viewGroup, z8);
            } catch (NoSuchMethodError unused) {
                f23537b = false;
            }
        }
    }

    public static void C(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void a(Logger logger, h8.a aVar, h8.c cVar, String str) {
        logger.fine(cVar.f38255b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f38248a);
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean i(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean j9 = j(file, inputStream);
                h(inputStream);
                return j9;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean j(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = X.f2240a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = W.f2236d;
        W w9 = (W) view.getTag(C5284R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (w9 == null) {
            w9 = new W();
            w9.f2237a = null;
            w9.f2238b = null;
            w9.f2239c = null;
            view.setTag(C5284R.id.tag_unhandled_key_event_manager, w9);
        }
        WeakReference weakReference2 = w9.f2239c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        w9.f2239c = new WeakReference(keyEvent);
        if (w9.f2238b == null) {
            w9.f2238b = new SparseArray();
        }
        SparseArray sparseArray = w9.f2238b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(C5284R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(InterfaceC0348j interfaceC0348j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z8 = false;
        if (interfaceC0348j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0348j.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f23538c) {
                            try {
                                f23539d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f23538c = true;
                        }
                        Method method = f23539d;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z8 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z8) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (X.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f23540e) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f23541f = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f23540e = true;
                }
                Field field = f23541f;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (X.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && X.c(view, keyEvent)) || interfaceC0348j.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final String m(long j9) {
        String str;
        if (j9 <= -999500000) {
            str = ((j9 - 500000000) / 1000000000) + " s ";
        } else if (j9 <= -999500) {
            str = ((j9 - 500000) / 1000000) + " ms";
        } else if (j9 <= 0) {
            str = ((j9 - 500) / 1000) + " µs";
        } else if (j9 < 999500) {
            str = ((j9 + 500) / 1000) + " µs";
        } else if (j9 < 999500000) {
            str = ((j9 + 500000) / 1000000) + " ms";
        } else {
            str = ((j9 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static q n(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        Y2.e a9 = q.f37445b.a(0, str);
        if (a9 == null) {
            throw new IllegalArgumentException(AbstractC5051n.b('\"', "No subtype found for: \"", str));
        }
        if (((M7.f) a9.f3965w) == null) {
            a9.f3965w = new M7.f(a9);
        }
        M7.f fVar = (M7.f) a9.f3965w;
        kotlin.jvm.internal.h.b(fVar);
        String str2 = (String) fVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
        if (((M7.f) a9.f3965w) == null) {
            a9.f3965w = new M7.f(a9);
        }
        M7.f fVar2 = (M7.f) a9.f3965w;
        kotlin.jvm.internal.h.b(fVar2);
        String lowerCase2 = ((String) fVar2.get(2)).toLowerCase(locale);
        kotlin.jvm.internal.h.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) a9.f3963u;
        int i = AbstractC0415a.E(matcher.start(), matcher.end()).f1465u;
        while (true) {
            int i4 = i + 1;
            if (i4 >= str.length()) {
                return new q(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            Y2.e a10 = q.f37446c.a(i4, str);
            if (a10 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i4);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            M7.h hVar = (M7.h) a10.f3964v;
            M7.e c4 = hVar.c(1);
            String str3 = c4 != null ? c4.f1931a : null;
            Matcher matcher2 = (Matcher) a10.f3963u;
            if (str3 == null) {
                i = AbstractC0415a.E(matcher2.start(), matcher2.end()).f1465u;
            } else {
                M7.e c9 = hVar.c(2);
                String str4 = c9 != null ? c9.f1931a : null;
                if (str4 == null) {
                    M7.e c10 = hVar.c(3);
                    kotlin.jvm.internal.h.b(c10);
                    str4 = c10.f1931a;
                } else if (M7.j.d0('\'', str4) && str4.length() > 0 && p8.g.f(str4.charAt(M7.j.O(str4)), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    kotlin.jvm.internal.h.d(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = AbstractC0415a.E(matcher2.start(), matcher2.end()).f1465u;
            }
        }
    }

    public static File o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static InterfaceC4936e p(EnumC4937f enumC4937f, E7.a aVar) {
        int ordinal = enumC4937f.ordinal();
        if (ordinal == 0) {
            return new C4942k(aVar);
        }
        C4950s c4950s = C4950s.f40180a;
        if (ordinal == 1) {
            C4941j c4941j = new C4941j();
            c4941j.f40166n = aVar;
            c4941j.f40167u = c4950s;
            return c4941j;
        }
        if (ordinal != 2) {
            throw new B0.c();
        }
        w wVar = new w();
        wVar.f40184n = aVar;
        wVar.f40185u = c4950s;
        return wVar;
    }

    public static C4942k q(E7.a initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        return new C4942k(initializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void r(Context context) {
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.h.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.h.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            s.d().a(K0.n.f1525a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.h.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(K0.a.f1483a.a(context), "androidx.work.workdb");
            String[] strArr = K0.n.f1526b;
            int z8 = t.z(strArr.length);
            if (z8 < 16) {
                z8 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(z8);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            C4938g c4938g = new C4938g(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = t.A(c4938g);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        s.d().g(K0.n.f1525a, "Over-writing contents of " + file3);
                    }
                    s.d().a(K0.n.f1525a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static InterfaceC5138i s(InterfaceC5136g interfaceC5136g, InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return kotlin.jvm.internal.h.a(interfaceC5136g.getKey(), key) ? C5139j.f41372n : interfaceC5136g;
    }

    public static MappedByteBuffer t(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv, null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static InterfaceC5138i w(InterfaceC5136g interfaceC5136g, InterfaceC5138i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context == C5139j.f41372n ? interfaceC5136g : (InterfaceC5138i) context.m(interfaceC5136g, new C5131b(1));
    }

    public abstract void A(C5015f c5015f, Thread thread);

    public abstract boolean b(U0.i iVar, U0.d dVar, U0.d dVar2);

    public abstract boolean c(AbstractC5016g abstractC5016g, C5012c c5012c, C5012c c5012c2);

    public abstract boolean d(U0.i iVar, Object obj, Object obj2);

    public abstract boolean e(AbstractC5016g abstractC5016g, Object obj, Object obj2);

    public abstract boolean f(U0.i iVar, U0.h hVar, U0.h hVar2);

    public abstract boolean g(AbstractC5016g abstractC5016g, C5015f c5015f, C5015f c5015f2);

    public int hashCode() {
        switch (this.f23542a) {
            case 6:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f23542a) {
            case 6:
                String b9 = kotlin.jvm.internal.s.a(getClass()).b();
                kotlin.jvm.internal.h.b(b9);
                return b9;
            default:
                return super.toString();
        }
    }

    public abstract void u(int i);

    public abstract void v(Typeface typeface, boolean z8);

    public abstract void x(U0.h hVar, U0.h hVar2);

    public abstract void y(C5015f c5015f, C5015f c5015f2);

    public abstract void z(U0.h hVar, Thread thread);
}
