package androidx.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedStateWriter.android.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J'\u00102\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J'\u00106\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u0002032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b4\u00105J\u001d\u0010:\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u000207¢\u0006\u0004\b8\u00109J\u001d\u0010>\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u001d\u0010A\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b?\u0010@J#\u0010E\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020#0B¢\u0006\u0004\bC\u0010DJ#\u0010G\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00170B¢\u0006\u0004\bF\u0010DJ#\u0010I\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070B¢\u0006\u0004\bH\u0010DJ-\u0010K\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000B¢\u0006\u0004\bJ\u0010DJ\u001d\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u001d\u0010S\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ#\u0010W\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00170T¢\u0006\u0004\bU\u0010VJ\u001d\u0010[\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020X¢\u0006\u0004\bY\u0010ZJ\u001d\u0010_\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\\¢\u0006\u0004\b]\u0010^J\u001d\u0010c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020`¢\u0006\u0004\ba\u0010bJ\u001d\u0010g\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020d¢\u0006\u0004\be\u0010fJ#\u0010j\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070T¢\u0006\u0004\bh\u0010iJ-\u0010m\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000T¢\u0006\u0004\bk\u0010lJ-\u0010q\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000n¢\u0006\u0004\bo\u0010pJ!\u0010t\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\br\u0010sJ\u0019\u0010x\u001a\u00020\u000b2\n\u0010u\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\bv\u0010wJ\u0015\u0010z\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\by\u0010,J\u0010\u0010}\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b{\u0010|J\u0011\u0010\u0080\u0001\u001a\u00020#HÖ\u0001¢\u0006\u0004\b~\u0010\u007fJ\u001e\u0010\u0084\u0001\u001a\u00020\u000f2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0085\u0001\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0086\u0001"}, d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "Landroid/os/IBinder;", "value", "", "putBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V", "putBinder", "", "putBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "putBoolean", "", "putChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;C)V", "putChar", "", "putCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/CharSequence;)V", "putCharSequence", "", "putDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;D)V", "putDouble", "", "putFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "putFloat", "", "putInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "putInt", "", "putLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "putLong", "putNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)V", "putNull", "Landroid/os/Parcelable;", "T", "putParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "putParcelable", "Ljava/io/Serializable;", "putJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "putJavaSerializable", "Landroid/util/Size;", "putSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "putSize", "Landroid/util/SizeF;", "putSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "putSizeF", "putString-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "putString", "", "putIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "putIntList", "putCharSequenceList-impl", "putCharSequenceList", "putStringList-impl", "putStringList", "putParcelableList-impl", "putParcelableList", "", "putBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "putBooleanArray", "", "putCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[C)V", "putCharArray", "", "putCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/CharSequence;)V", "putCharSequenceArray", "", "putDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[D)V", "putDoubleArray", "", "putFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "putFloatArray", "", "putIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "putIntArray", "", "putLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "putLongArray", "putStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "putStringArray", "putParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "putParcelableArray", "Landroid/util/SparseArray;", "putSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SparseArray;)V", "putSparseParcelableArray", "putSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "putSavedState", "from", "putAll-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "putAll", "remove-impl", "remove", "toString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroid/os/Bundle;)I", "hashCode", "other", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "equals", "Landroid/os/Bundle;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedStateWriter {
    private final Bundle source;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m2843constructorimpl(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2844equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && Intrinsics.areEqual(bundle, ((SavedStateWriter) obj).getSource());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2845hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2877toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m2844equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m2845hashCodeimpl(this.source);
    }

    public String toString() {
        return m2877toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m2847putBinderimpl(Bundle bundle, String key, IBinder value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBinder(key, value);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m2848putBooleanimpl(Bundle bundle, String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBoolean(key, z);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m2850putCharimpl(Bundle bundle, String key, char c) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putChar(key, c);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m2852putCharSequenceimpl(Bundle bundle, String key, CharSequence value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequence(key, value);
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m2855putDoubleimpl(Bundle bundle, String key, double d) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putDouble(key, d);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m2857putFloatimpl(Bundle bundle, String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putFloat(key, f);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m2859putIntimpl(Bundle bundle, String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putInt(key, i);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m2863putLongimpl(Bundle bundle, String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putLong(key, j);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m2865putNullimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final void m2866putParcelableimpl(Bundle bundle, String key, Parcelable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelable(key, value);
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final void m2862putJavaSerializableimpl(Bundle bundle, String key, Serializable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSerializable(key, value);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m2870putSizeimpl(Bundle bundle, String key, Size value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSize(key, value);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m2871putSizeFimpl(Bundle bundle, String key, SizeF value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSizeF(key, value);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m2873putStringimpl(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putString(key, value);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m2861putIntListimpl(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putIntegerArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m2854putCharSequenceListimpl(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m2875putStringListimpl(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final void m2868putParcelableListimpl(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelableArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m2849putBooleanArrayimpl(Bundle bundle, String key, boolean[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBooleanArray(key, value);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m2851putCharArrayimpl(Bundle bundle, String key, char[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharArray(key, value);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m2853putCharSequenceArrayimpl(Bundle bundle, String key, CharSequence[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m2856putDoubleArrayimpl(Bundle bundle, String key, double[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putDoubleArray(key, value);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m2858putFloatArrayimpl(Bundle bundle, String key, float[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putFloatArray(key, value);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m2860putIntArrayimpl(Bundle bundle, String key, int[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putIntArray(key, value);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m2864putLongArrayimpl(Bundle bundle, String key, long[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putLongArray(key, value);
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m2874putStringArrayimpl(Bundle bundle, String key, String[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArray(key, value);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final void m2867putParcelableArrayimpl(Bundle bundle, String key, Parcelable[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelableArray(key, value);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final void m2872putSparseParcelableArrayimpl(Bundle bundle, String key, SparseArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m2869putSavedStateimpl(Bundle bundle, String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m2846putAllimpl(Bundle bundle, Bundle from) {
        Intrinsics.checkNotNullParameter(from, "from");
        bundle.putAll(from);
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m2876removeimpl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.remove(key);
    }
}
