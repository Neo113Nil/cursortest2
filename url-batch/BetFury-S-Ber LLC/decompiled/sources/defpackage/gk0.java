package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.SQLException;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.trembin.nirefon.betfury.R;
import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.receiver.AlarmReceiver;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class gk0 {
    public static ExecutorService b = null;
    public static boolean s = false;
    public static Method t = null;
    public static boolean u = false;
    public static Field v;
    public static final Object a = new Object();
    public static final int[] c = new int[0];
    public static final Object[] d = new Object[0];
    public static final lm e = new lm("REMOVED_TASK", 1);
    public static final lm f = new lm("CLOSED_EMPTY", 1);
    public static final lm g = new lm("NO_OWNER", 1);
    public static final byte[] h = {48, 49, 53, 0};
    public static final byte[] i = {48, 49, 48, 0};
    public static final byte[] j = {48, 48, 57, 0};
    public static final byte[] k = {48, 48, 53, 0};
    public static final byte[] l = {48, 48, 49, 0};
    public static final byte[] m = {48, 48, 49, 0};
    public static final byte[] n = {48, 48, 50, 0};
    public static final lm o = new lm("NO_THREAD_ELEMENTS", 1);
    public static final gd p = new gd(5);
    public static final gd q = new gd(6);
    public static final gd r = new gd(7);

    public static jp A(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            Q(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), z60.b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), z60.c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            Q(xmlResourceParser);
                        }
                        arrayList.add(new lp(string7, i7, z, string6, i9, resourceId2));
                    } else {
                        Q(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new kp((lp[]) arrayList.toArray(new lp[0]));
        }
        List D = D(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), z60.d);
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = obtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            Q(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                cp cpVar = new cp(string, string2, string8, D, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(cpVar);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                Q(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new mp(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            s9.k("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new cp(string, string2, string3, D, null, null));
        if (string4 != null) {
            arrayList2.add(new cp(string, string2, string4, D, null, null));
        }
        return new mp(arrayList2, i11, integer2, string5);
    }

    public static long B(String str, int i2) {
        int m2 = m(str, 0, i2, false);
        Matcher matcher = fg.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (m2 < i2) {
            int m3 = m(str, m2 + 1, i2, true);
            matcher.region(m2, m3);
            if (i4 == -1 && matcher.usePattern(fg.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(fg.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = fg.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = mf0.u(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(fg.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            m2 = m(str, m3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            s9.k("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            s9.k("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            s9.k("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            s9.k("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            s9.k("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            s9.k("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(zk0.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static byte[] C(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                s9.u(r7.b("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    public static List D(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] E(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static final List F(eb0 eb0Var) {
        int t2 = bi.t(eb0Var, "id");
        int t3 = bi.t(eb0Var, "seq");
        int t4 = bi.t(eb0Var, "from");
        int t5 = bi.t(eb0Var, "to");
        dy u2 = bi.u();
        while (eb0Var.G()) {
            u2.add(new pp((int) eb0Var.getLong(t2), (int) eb0Var.getLong(t3), eb0Var.h(t4), eb0Var.h(t5)));
        }
        return uc.m0(bi.i(u2));
    }

    public static final eh0 G(cb0 cb0Var, String str, boolean z) {
        eb0 N = cb0Var.N("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int t2 = bi.t(N, "seqno");
            int t3 = bi.t(N, "cid");
            int t4 = bi.t(N, "name");
            int t5 = bi.t(N, "desc");
            if (t2 != -1 && t3 != -1 && t4 != -1 && t5 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (N.G()) {
                    if (((int) N.getLong(t3)) >= 0) {
                        int i2 = (int) N.getLong(t2);
                        String h2 = N.h(t4);
                        String str2 = N.getLong(t5) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), h2);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List n0 = uc.n0(linkedHashMap.entrySet(), new yb(5));
                ArrayList arrayList = new ArrayList(wc.g0(n0));
                Iterator it = n0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List q0 = uc.q0(arrayList);
                List n02 = uc.n0(linkedHashMap2.entrySet(), new yb(6));
                ArrayList arrayList2 = new ArrayList(wc.g0(n02));
                Iterator it2 = n02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                eh0 eh0Var = new eh0(str, z, q0, uc.q0(arrayList2));
                mv.h(N, null);
                return eh0Var;
            }
            mv.h(N, null);
            return null;
        } finally {
        }
    }

    public static long H(InputStream inputStream, int i2) {
        byte[] C = C(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (C[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static void I(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final void J(qg qgVar, Object obj) {
        if (obj == o) {
            return;
        }
        if (!(obj instanceof di0)) {
            Object n2 = qgVar.n(null, q);
            n2.getClass();
            ((zh0) n2).g.set(obj);
            return;
        }
        di0 di0Var = (di0) obj;
        zh0[] zh0VarArr = di0Var.c;
        int length = zh0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            zh0 zh0Var = zh0VarArr[length];
            zh0Var.getClass();
            zh0Var.g.set(di0Var.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final void K(ka kaVar, dg dgVar, boolean z) {
        Object obj = ka.l.get(kaVar);
        Throwable h2 = kaVar.h(obj);
        Object z90Var = h2 != null ? new z90(h2) : kaVar.i(obj);
        if (!z) {
            dgVar.e(z90Var);
            return;
        }
        dgVar.getClass();
        ek ekVar = (ek) dgVar;
        eg egVar = ekVar.j;
        Object obj2 = ekVar.l;
        qg qgVar = egVar.g;
        qgVar.getClass();
        Object U = U(qgVar, obj2);
        qk0 c0 = U != o ? d50.c0(egVar, qgVar, U) : null;
        try {
            egVar.e(z90Var);
            if (c0 == null || c0.S()) {
                J(qgVar, U);
            }
        } catch (Throwable th) {
            if (c0 == null || c0.S()) {
                J(qgVar, U);
            }
            throw th;
        }
    }

    public static final Object L(qg qgVar, xr xrVar) {
        ln lnVar;
        qg q2;
        Thread currentThread = Thread.currentThread();
        pg pgVar = sl.g;
        tg tgVar = (tg) qgVar.w(pgVar);
        um umVar = um.f;
        if (tgVar == null) {
            lnVar = ai0.a();
            q2 = d50.q(umVar, qgVar.r(lnVar), true);
            si siVar = ik.a;
            if (q2 != siVar && q2.w(pgVar) == null) {
                q2 = q2.r(siVar);
            }
        } else {
            lnVar = (ln) ai0.a.get();
            q2 = d50.q(umVar, qgVar, true);
            si siVar2 = ik.a;
            if (q2 != siVar2 && q2.w(pgVar) == null) {
                q2 = q2.r(siVar2);
            }
        }
        y8 y8Var = new y8(q2, currentThread, lnVar);
        eh.DEFAULT.invoke(xrVar, y8Var, y8Var);
        ln lnVar2 = y8Var.j;
        if (lnVar2 != null) {
            int i2 = ln.k;
            lnVar2.S(false);
        }
        while (!Thread.interrupted()) {
            try {
                long T = lnVar2 != null ? lnVar2.T() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mw.f;
                if (!(atomicReferenceFieldUpdater.get(y8Var) instanceof wu)) {
                    if (lnVar2 != null) {
                        int i3 = ln.k;
                        lnVar2.R(false);
                    }
                    Object T2 = n9.T(atomicReferenceFieldUpdater.get(y8Var));
                    ld ldVar = T2 instanceof ld ? (ld) T2 : null;
                    if (ldVar == null) {
                        return T2;
                    }
                    throw ldVar.a;
                }
                LockSupport.parkNanos(y8Var, T);
            } catch (Throwable th) {
                if (lnVar2 != null) {
                    int i4 = ln.k;
                    lnVar2.R(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        y8Var.g(interruptedException);
        throw interruptedException;
    }

    public static void M(Context context, Note note) {
        PendingIntent broadcast;
        context.getClass();
        note.getClass();
        Long reminderTime = note.getReminderTime();
        if (reminderTime != null) {
            long longValue = reminderTime.longValue();
            if (longValue <= System.currentTimeMillis()) {
                return;
            }
            if (note.getId() == 0) {
                broadcast = null;
            } else {
                Intent intent = new Intent(context, (Class<?>) AlarmReceiver.class);
                intent.putExtra(AlarmReceiver.EXTRA_TITLE, note.getTitle());
                intent.putExtra(AlarmReceiver.EXTRA_CONTENT, note.getContent());
                broadcast = PendingIntent.getBroadcast(context, note.getId(), intent, 201326592);
            }
            if (broadcast == null) {
                return;
            }
            ((AlarmManager) context.getSystemService(AlarmManager.class)).setAndAllowWhileIdle(0, longValue, broadcast);
        }
    }

    public static final int N(oc0 oc0Var, int i2) {
        int i3;
        int[] iArr = oc0Var.k;
        int i4 = i2 + 1;
        int length = oc0Var.j.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static void O(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void P(i5 i5Var, float f2) {
        ua0 ua0Var = (ua0) i5Var.g;
        oa oaVar = (oa) i5Var.h;
        boolean useCompatPadding = oaVar.getUseCompatPadding();
        boolean preventCornerOverlap = oaVar.getPreventCornerOverlap();
        if (f2 != ua0Var.e || ua0Var.f != useCompatPadding || ua0Var.g != preventCornerOverlap) {
            ua0Var.e = f2;
            ua0Var.f = useCompatPadding;
            ua0Var.g = preventCornerOverlap;
            ua0Var.b(null);
            ua0Var.invalidateSelf();
        }
        if (!oaVar.getUseCompatPadding()) {
            i5Var.Q(0, 0, 0, 0);
            return;
        }
        ua0 ua0Var2 = (ua0) i5Var.g;
        float f3 = ua0Var2.e;
        float f4 = ua0Var2.a;
        int ceil = (int) Math.ceil(va0.a(f3, f4, oaVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(va0.b(f3, f4, oaVar.getPreventCornerOverlap()));
        i5Var.Q(ceil, ceil2, ceil, ceil2);
    }

    public static void Q(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void R(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        mv.M(classCastException, gk0.class.getName());
        throw classCastException;
    }

    public static final void S(String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static void T(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static final Object U(qg qgVar, Object obj) {
        if (obj == null) {
            obj = qgVar.n(0, p);
            obj.getClass();
        }
        if (obj == 0) {
            return o;
        }
        if (obj instanceof Integer) {
            return qgVar.n(new di0(qgVar, ((Number) obj).intValue()), r);
        }
        zh0 zh0Var = (zh0) obj;
        ThreadLocal threadLocal = zh0Var.g;
        Object obj2 = threadLocal.get();
        threadLocal.set(zh0Var.f);
        return obj2;
    }

    public static final Object V(qg qgVar, xr xrVar, eg egVar) {
        Object T;
        qg qgVar2 = egVar.g;
        qgVar2.getClass();
        qg r2 = !((Boolean) qgVar.n(Boolean.FALSE, new gd(4))).booleanValue() ? qgVar2.r(qgVar) : d50.q(qgVar2, qgVar, false);
        mw mwVar = (mw) r2.w(sl.k);
        if (mwVar != null && !mwVar.C()) {
            throw mwVar.s();
        }
        if (r2 == qgVar2) {
            vb0 vb0Var = new vb0(r2, egVar);
            T = xc0.f(vb0Var, vb0Var, xrVar);
        } else {
            sl slVar = sl.g;
            if (mv.c(r2.w(slVar), qgVar2.w(slVar))) {
                qk0 qk0Var = new qk0(r2, egVar);
                qg qgVar3 = qk0Var.h;
                Object U = U(qgVar3, null);
                try {
                    Object f2 = xc0.f(qk0Var, qk0Var, xrVar);
                    J(qgVar3, U);
                    T = f2;
                } catch (Throwable th) {
                    J(qgVar3, U);
                    throw th;
                }
            } else {
                fk fkVar = new fk(r2, egVar);
                try {
                    mv.L(n9.z(n9.i(xrVar, fkVar, fkVar)), sk0.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = fk.j;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(fkVar);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                s9.u("Already suspended");
                                return null;
                            }
                            T = n9.T(mw.f.get(fkVar));
                            if (T instanceof ld) {
                                throw ((ld) T).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(fkVar, 0, 1)) {
                            T = bh.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    fkVar.e(new z90(th2));
                    throw th2;
                }
            }
        }
        bh bhVar = bh.COROUTINE_SUSPENDED;
        return T;
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        W(byteArrayOutputStream, i2, 2);
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void b(Object obj) {
        if (obj == null || w(2, obj)) {
            return;
        }
        R(obj, "kotlin.jvm.functions.Function2");
        throw null;
    }

    public static final int c(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int d(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void e(String str) {
        if (str.length() <= 0) {
            s9.k("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                s9.e(zk0.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
    }

    public static void f(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                s9.e(zk0.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2).concat(zk0.n(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static int g(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String h(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static byte[] i(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static ImageView.ScaleType j(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static float[] k(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m50[] l(String str) {
        int i2;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char charAt = str.charAt(i5);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i5++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i4, i5).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i3) == 'z' || trim.charAt(i3) == 'Z') {
                            fArr = new float[i3];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i6 = i3;
                                int i7 = 1;
                                while (i7 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i7; i12 < trim.length(); i12++) {
                                        char charAt2 = trim.charAt(i12);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i12 != i7 && i8 == 0) {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                        i8 = 0;
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                            break;
                                                        }
                                                        i8 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 == 0) {
                                                if (i7 < i12) {
                                                    fArr2[i6] = Float.parseFloat(trim.substring(i7, i12));
                                                    i6++;
                                                }
                                                i7 = i11 == 0 ? i12 : i12 + 1;
                                                i3 = 0;
                                            }
                                        }
                                        i8 = 0;
                                        i10 = 1;
                                        if (i10 == 0) {
                                        }
                                    }
                                    if (i7 < i12) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    i3 = 0;
                                }
                                fArr = k(fArr2, i6);
                                i3 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException(r7.c("error in parsing \"", trim, "\""), e2);
                            }
                        }
                        arrayList.add(new m50(trim.charAt(i3), fArr));
                    }
                    i4 = i5;
                    i5++;
                    i3 = 0;
                }
                i5++;
            }
            trim = str.substring(i4, i5).trim();
            if (!trim.isEmpty()) {
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new m50(str.charAt(i4), new float[0]));
        }
        return (m50[]) arrayList.toArray(new m50[i2]);
    }

    public static int m(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = hm0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = gm0.d;
            gm0 gm0Var = (gm0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (gm0Var == null) {
                gm0Var = new gm0();
                gm0Var.a = null;
                gm0Var.b = null;
                gm0Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, gm0Var);
            }
            WeakReference weakReference2 = gm0Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                gm0Var.c = new WeakReference(keyEvent);
                if (gm0Var.b == null) {
                    gm0Var.b = new SparseArray();
                }
                SparseArray sparseArray = gm0Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    s9.c();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(sw swVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (swVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return swVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!s) {
                            try {
                                t = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            s = true;
                        }
                        Method method = t;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (hm0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!u) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        v = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    u = true;
                }
                Field field = v;
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
                    if (hm0.c(decorView2, keyEvent)) {
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
            } else if ((view != null && hm0.c(view, keyEvent)) || swVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final void p(cb0 cb0Var, String str) {
        cb0Var.getClass();
        eb0 N = cb0Var.N(str);
        try {
            N.G();
            mv.h(N, null);
        } finally {
        }
    }

    public static Intent q(u3 u3Var) {
        Intent parentActivityIntent = u3Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String s2 = s(u3Var, u3Var.getComponentName());
            if (s2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(u3Var, s2);
            try {
                return s(u3Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + s2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent r(u3 u3Var, ComponentName componentName) {
        String s2 = s(u3Var, componentName);
        if (s2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), s2);
        return s(u3Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String s(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final void t(qg qgVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = ug.a.iterator();
        while (it.hasNext()) {
            try {
                ((a3) it.next()).O(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    bi.f(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            bi.f(th, new qj(qgVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final int u(i7 i7Var, Object obj, int i2) {
        int i3 = i7Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int c2 = c(i3, i2, i7Var.f);
            if (c2 < 0 || mv.c(obj, i7Var.g[c2])) {
                return c2;
            }
            int i4 = c2 + 1;
            while (i4 < i3 && i7Var.f[i4] == i2) {
                if (mv.c(obj, i7Var.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = c2 - 1; i5 >= 0 && i7Var.f[i5] == i2; i5--) {
                if (mv.c(obj, i7Var.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static boolean v(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean w(int i2, Object obj) {
        if (obj instanceof ds) {
            if ((obj instanceof es ? ((es) obj).b() : obj instanceof ir ? 0 : obj instanceof tr ? 1 : obj instanceof xr ? 2 : obj instanceof ja ? 3 : obj instanceof xq ? 4 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final af0 x(ah ahVar, qg qgVar, eh ehVar, xr xrVar) {
        qg q2 = d50.q(ahVar.i(), qgVar, true);
        si siVar = ik.a;
        if (q2 != siVar && q2.w(sl.g) == null) {
            q2 = q2.r(siVar);
        }
        af0 ywVar = ehVar.isLazy() ? new yw(q2, xrVar) : new af0(q2, true);
        ehVar.invoke(xrVar, ywVar, ywVar);
        return ywVar;
    }

    public static af0 y(ah ahVar, qg qgVar, xr xrVar, int i2) {
        if ((i2 & 1) != 0) {
            qgVar = um.f;
        }
        eh ehVar = eh.DEFAULT;
        qg q2 = d50.q(ahVar.i(), qgVar, true);
        si siVar = ik.a;
        if (q2 != siVar && q2.w(sl.g) == null) {
            q2 = q2.r(siVar);
        }
        af0 ywVar = ehVar.isLazy() ? new yw(q2, xrVar) : new af0(q2, true);
        ehVar.invoke(xrVar, ywVar, ywVar);
        return ywVar;
    }

    public static bt z(String... strArr) {
        if (strArr.length % 2 != 0) {
            s9.k("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                s9.k("Headers cannot be null");
                return null;
            }
            strArr2[i3] = mf0.E(str).toString();
        }
        int w = mv.w(0, strArr2.length - 1, 2);
        if (w >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                e(str2);
                f(str3, str2);
                if (i2 == w) {
                    break;
                }
                i2 += 2;
            }
        }
        return new bt(strArr2);
    }
}
