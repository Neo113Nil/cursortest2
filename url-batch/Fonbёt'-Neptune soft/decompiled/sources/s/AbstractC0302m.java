package s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* renamed from: s.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0302m {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3421a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f3422b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3423c = new Object();

    public static void a(C0301l c0301l, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3423c) {
            try {
                WeakHashMap weakHashMap = f3422b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c0301l);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c0301l, sparseArray);
                }
                sparseArray.append(i2, new C0300k(colorStateList, c0301l.f3419a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
