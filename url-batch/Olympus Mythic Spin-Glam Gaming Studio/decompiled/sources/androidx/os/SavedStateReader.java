package androidx.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: SavedStateReader.android.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u000e\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010$\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010(\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J-\u0010/\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b-\u0010.J-\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010**\u0002002\u0006\u0010\b\u001a\u00020\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b2\u00103J\u0015\u00108\u001a\u0002052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\u0015\u0010<\u001a\u0002092\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\u0015\u0010?\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b=\u0010>J\u001b\u0010C\u001a\b\u0012\u0004\u0012\u00020!0@2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150@2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bD\u0010BJ\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070@2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bF\u0010BJ\u001d\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010@2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bH\u0010BJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\b\b\u0000\u0010**\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\bJ\u0010KJ\u0015\u0010P\u001a\u00020M2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bN\u0010OJ\u0015\u0010T\u001a\u00020Q2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bR\u0010SJ\u001b\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00150U2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bV\u0010WJ\u0015\u0010\\\u001a\u00020Y2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010[J\u0015\u0010`\u001a\u00020]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b^\u0010_J\u0015\u0010d\u001a\u00020a2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bb\u0010cJ\u0015\u0010h\u001a\u00020e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bf\u0010gJ\u001b\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070U2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bi\u0010jJ3\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\b\b\u0000\u0010**\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\bl\u0010mJ5\u0010p\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010U\"\b\b\u0000\u0010**\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\bo\u0010mJ3\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000q\"\b\b\u0000\u0010**\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\br\u0010sJ5\u0010v\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010q\"\b\b\u0000\u0010**\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\bu\u0010sJ\u0019\u0010y\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bw\u0010xJ\u001d\u0010{\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bz\u0010xJ\r\u0010~\u001a\u00020!¢\u0006\u0004\b|\u0010}J\u000f\u0010\u0081\u0001\u001a\u00020\r¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0017\u0010\u0083\u0001\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0005\b\u0082\u0001\u0010\u000fJ\u001a\u0010\u0085\u0001\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u000fJ\u001f\u0010\u0089\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0086\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0013\u0010\u008c\u0001\u001a\u00020\u0007HÖ\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u008e\u0001\u001a\u00020!HÖ\u0001¢\u0006\u0005\b\u008d\u0001\u0010}J\u001e\u0010\u0092\u0001\u001a\u00020\r2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0093\u0001\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0094\u0001"}, d2 = {"Landroidx/savedstate/SavedStateReader;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "Landroid/os/IBinder;", "getBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;", "getBinder", "", "getBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "getBoolean", "", "getChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;)C", "getChar", "", "getCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/CharSequence;", "getCharSequence", "", "getDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;)D", "getDouble", "", "getFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;)F", "getFloat", "", "getInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;)I", "getInt", "", "getLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;)J", "getLong", "Landroid/os/Parcelable;", "T", "Lkotlin/reflect/KClass;", "parcelableClass", "getParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/os/Parcelable;", "getParcelable", "Ljava/io/Serializable;", "serializableClass", "getJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/io/Serializable;", "getJavaSerializable", "Landroid/util/Size;", "getSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/Size;", "getSize", "Landroid/util/SizeF;", "getSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SizeF;", "getSizeF", "getString-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "getString", "", "getIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getIntList", "getCharSequenceList-impl", "getCharSequenceList", "getStringList-impl", "getStringList", "getStringListOrNull-impl", "getStringListOrNull", "getParcelableList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/util/List;", "getParcelableList", "", "getBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "getBooleanArray", "", "getCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[C", "getCharArray", "", "getCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/CharSequence;", "getCharSequenceArray", "", "getDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[D", "getDoubleArray", "", "getFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "getFloatArray", "", "getIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "getIntArray", "", "getLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "getLongArray", "getStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "getStringArray", "getParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)[Landroid/os/Parcelable;", "getParcelableArray", "getParcelableArrayOrNull-impl", "getParcelableArrayOrNull", "Landroid/util/SparseArray;", "getSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/util/SparseArray;", "getSparseParcelableArray", "getSparseParcelableArrayOrNull-impl", "getSparseParcelableArrayOrNull", "getSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "getSavedState", "getSavedStateOrNull-impl", "getSavedStateOrNull", "size-impl", "(Landroid/os/Bundle;)I", "size", "isEmpty-impl", "(Landroid/os/Bundle;)Z", "isEmpty", "isNull-impl", "isNull", "contains-impl", "contains", "", "toMap-impl", "(Landroid/os/Bundle;)Ljava/util/Map;", "toMap", "toString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "equals", "Landroid/os/Bundle;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SavedStateReader {
    private final Bundle source;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m2801constructorimpl(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2803equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && Intrinsics.areEqual(bundle, ((SavedStateReader) obj).getSource());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2836hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2841toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m2803equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m2836hashCodeimpl(this.source);
    }

    public String toString() {
        return m2841toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }

    /* renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m2804getBinderimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m2805getBooleanimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = bundle.getBoolean(key, false);
        if (z || !bundle.getBoolean(key, true)) {
            return z;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getChar-impl, reason: not valid java name */
    public static final char m2807getCharimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char c = bundle.getChar(key, (char) 0);
        if (c != 0 || bundle.getChar(key, (char) 65535) != 65535) {
            return c;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m2809getCharSequenceimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getDouble-impl, reason: not valid java name */
    public static final double m2812getDoubleimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double d = bundle.getDouble(key, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getFloat-impl, reason: not valid java name */
    public static final float m2814getFloatimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float f = bundle.getFloat(key, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m2816getIntimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getLong-impl, reason: not valid java name */
    public static final long m2820getLongimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long j = bundle.getLong(key, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final Parcelable m2822getParcelableimpl(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        Parcelable parcelable = (Parcelable) BundleCompat.getParcelable(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
        if (parcelable != null) {
            return parcelable;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final Serializable m2819getJavaSerializableimpl(Bundle bundle, String key, KClass serializableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Serializable serializable = BundleCompat.getSerializable(bundle, key, JvmClassMappingKt.getJavaClass(serializableClass));
        if (serializable != null) {
            return serializable;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final Size m2828getSizeimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m2829getSizeFimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m2832getStringimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntList-impl, reason: not valid java name */
    public static final List m2818getIntListimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List m2811getCharSequenceListimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringList-impl, reason: not valid java name */
    public static final List m2834getStringListimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List m2835getStringListOrNullimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final List m2825getParcelableListimpl(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m2806getBooleanArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m2808getCharArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m2810getCharSequenceArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m2813getDoubleArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m2815getFloatArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m2817getIntArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m2821getLongArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m2833getStringArrayimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final Parcelable[] m2823getParcelableArrayimpl(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        Parcelable[] m2824getParcelableArrayOrNullimpl = m2824getParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (m2824getParcelableArrayOrNullimpl != null) {
            return m2824getParcelableArrayOrNullimpl;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final Parcelable[] m2824getParcelableArrayOrNullimpl(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        Parcelable[] parcelableArray = BundleCompat.getParcelableArray(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
        if (parcelableArray != null) {
            return parcelableArray;
        }
        return null;
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final SparseArray m2830getSparseParcelableArrayimpl(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        SparseArray m2831getSparseParcelableArrayOrNullimpl = m2831getSparseParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (m2831getSparseParcelableArrayOrNullimpl != null) {
            return m2831getSparseParcelableArrayOrNullimpl;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final SparseArray m2831getSparseParcelableArrayOrNullimpl(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        return BundleCompat.getSparseParcelableArray(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
    }

    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m2826getSavedStateimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m2827getSavedStateOrNullimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    /* renamed from: size-impl, reason: not valid java name */
    public static final int m2839sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m2837isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m2838isNullimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return m2802containsimpl(bundle, key) && bundle.get(key) == null;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m2802containsimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    /* renamed from: toMap-impl, reason: not valid java name */
    public static final Map m2840toMapimpl(Bundle bundle) {
        Map createMapBuilder = MapsKt.createMapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            createMapBuilder.put(str, bundle.get(str));
        }
        return MapsKt.build(createMapBuilder);
    }
}
