package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class BundleCompat {
    public static Object getParcelable(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getParcelable(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Parcelable[] getParcelableArray(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) Api33Impl.getParcelableArray(bundle, str, cls);
        }
        return bundle.getParcelableArray(str);
    }

    public static ArrayList getParcelableArrayList(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getParcelableArrayList(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }

    public static SparseArray getSparseParcelableArray(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getSparseParcelableArray(bundle, str, cls);
        }
        return bundle.getSparseParcelableArray(str);
    }

    public static Serializable getSerializable(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getSerializable(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    @RequiresApi
    static class Api33Impl {
        @DoNotInline
        static <T> T getParcelable(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        @DoNotInline
        static <T> T[] getParcelableArray(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        @DoNotInline
        static <T> ArrayList<T> getParcelableArrayList(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        @DoNotInline
        static <T> SparseArray<T> getSparseParcelableArray(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }

        @DoNotInline
        static <T extends Serializable> T getSerializable(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }
    }
}
