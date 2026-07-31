package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.m;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PersistentVectorBuilder.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010%\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b%\u0010&JA\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010+\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070,H\u0002¢\u0006\u0004\b.\u0010/JG\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0014\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b1\u00102JO\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0014\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060,H\u0002¢\u0006\u0004\b4\u00105J1\u00107\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b7\u00108JI\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J]\u0010;\u001a\u00020$2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u00106\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n2\u0016\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010@\u001a\u00020\n2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b;\u0010BJW\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010C\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n2\u0016\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010@\u001a\u00020\n2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJm\u0010H\u001a\u00020$2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u00106\u001a\u00020\n2\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010G\u001a\u00020\n2\u0016\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010@\u001a\u00020\n2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\bJ\u0010KJ;\u0010L\u001a\u0004\u0018\u00010\u00072\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ?\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010N\u001a\u000209H\u0002¢\u0006\u0004\bO\u0010PJ1\u0010Q\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\bQ\u0010RJA\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010N\u001a\u000209H\u0002¢\u0006\u0004\bS\u0010PJ#\u0010V\u001a\u00020\u00142\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140TH\u0002¢\u0006\u0004\bV\u0010WJ1\u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bX\u0010\u001bJ7\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00106\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\bY\u0010ZJ3\u0010\\\u001a\u00020\n2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140T2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010[\u001a\u000209H\u0002¢\u0006\u0004\b\\\u0010]JC\u0010V\u001a\u00020\n2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140T2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010^\u001a\u00020\n2\u0006\u0010[\u001a\u000209H\u0002¢\u0006\u0004\bV\u0010_Jw\u0010c\u001a\u00020\n2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140T2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010^\u001a\u00020\n2\u0006\u0010`\u001a\u00020\n2\u0006\u0010[\u001a\u0002092\u0014\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060a2\u0014\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060aH\u0002¢\u0006\u0004\bc\u0010dJG\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010e\u001a\u00028\u00002\u0006\u0010f\u001a\u000209H\u0002¢\u0006\u0004\bg\u0010<J%\u0010i\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060h2\u0006\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010l\u001a\u00020\nH\u0000¢\u0006\u0004\bk\u0010\u000fJ\u0015\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\bo\u0010pJ\u001d\u0010q\u001a\u00020\u00142\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010o\u001a\u00020$2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\bo\u0010sJ%\u0010q\u001a\u00020\u00142\u0006\u00106\u001a\u00020\n2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0016¢\u0006\u0004\bq\u0010tJ\u0018\u0010u\u001a\u00028\u00002\u0006\u00106\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00028\u00002\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\bw\u0010vJ\u001d\u0010V\u001a\u00020\u00142\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0016¢\u0006\u0004\bV\u0010rJ!\u0010x\u001a\u00020\u00142\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140T¢\u0006\u0004\bx\u0010WJ \u0010y\u001a\u00028\u00002\u0006\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\by\u0010zJ\u0016\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000{H\u0096\u0002¢\u0006\u0004\b|\u0010}J\u0016\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001d\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~2\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b\u007f\u0010jR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010\u0081\u0001R!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u0082\u0001R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u0082\u0001R&\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u000b\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010\u000f\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R;\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008a\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b!\u0010\u0082\u0001\u001a\u0005\b\u008b\u0001\u0010 R7\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008a\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b'\u0010\u0082\u0001\u001a\u0005\b\u008c\u0001\u0010 R'\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\b\u0010\u0010\u0083\u0001\u001a\u0005\b\u008d\u0001\u0010\u000f¨\u0006\u008e\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "rootSize", "()I", "size", "tailSize", "(I)I", "buffer", "", "isMutable", "([Ljava/lang/Object;)Z", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "makeMutableShiftingRight", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "mutableBuffer", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", "pushFilledTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "copyToBuffer", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "buffers", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "pushBuffers", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "insertIntoRoot", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "shiftLeafBuffers", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "splitToBuffers", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "bufferFor", "(I)[Ljava/lang/Object;", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "removeFromRootAt", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pullLastBuffer", "Lkotlin/Function1;", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Z", "retainFirst", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "bufferRef", "removeAllFromTail", "(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "bufferSize", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "toBufferSize", "", "recyclableBuffers", "recyclableRemoveAll", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", EidRequestBuilder.REQUEST_FIELD_EMAIL, "oldElementCarry", "setInRoot", "", "leafBufferIterator", "(I)Ljava/util/ListIterator;", "getModCount$runtime", "getModCount", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", m.l, "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAllWithPredicate", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "[Ljava/lang/Object;", "I", "getRootShift$runtime", "setRootShift$runtime", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "value", "getRoot$runtime", "getTail$runtime", "getSize", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentVectorBuilder<E> extends AbstractMutableList implements PersistentList.Builder<E> {
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList persistentList, Object[] objArr, Object[] objArr2, int i) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    /* renamed from: getRootShift$runtime, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    /* renamed from: getRoot$runtime, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* renamed from: getTail$runtime, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public final int getModCount$runtime() {
        return ((AbstractList) this).modCount;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder
    public PersistentList build() {
        PersistentList persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.tail, size());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    persistentVector = new SmallPersistentVector(copyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                Intrinsics.checkNotNull(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return persistentVector;
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final int tailSize(int size) {
        return size <= 32 ? size : size - UtilsKt.rootSize(size);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final boolean isMutable(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final Object[] makeMutable(Object[] buffer) {
        if (buffer == null) {
            return mutableBuffer();
        }
        return isMutable(buffer) ? buffer : ArraysKt.copyInto$default(buffer, mutableBuffer(), 0, 0, RangesKt.coerceAtMost(buffer.length, 32), 6, (Object) null);
    }

    private final Object[] makeMutableShiftingRight(Object[] buffer, int distance) {
        if (isMutable(buffer)) {
            return ArraysKt.copyInto(buffer, buffer, distance, 0, 32 - distance);
        }
        return ArraysKt.copyInto(buffer, mutableBuffer(), distance, 0, 32 - distance);
    }

    private final Object[] mutableBufferWith(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object element) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = element;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(element));
        }
        return true;
    }

    private final void pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size > (1 << i)) {
            this.root = pushTail(mutableBufferWith(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = pushTail(root, filledTail, i);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] root, Object[] tail, int shift) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, shift);
        Object[] makeMutable = makeMutable(root);
        if (shift == 5) {
            makeMutable[indexSegment] = tail;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], tail, shift - 5);
        }
        return makeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<E> it = elements.iterator();
        if (32 - tailSize >= elements.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    private final Object[] copyToBuffer(Object[] buffer, int bufferIndex, Iterator sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] root, int rootSize, Object[][] buffers) {
        Object[] makeMutable;
        Iterator it = ArrayIteratorKt.iterator(buffers);
        int i = rootSize >> 5;
        int i2 = this.rootShift;
        if (i < (1 << i2)) {
            makeMutable = pushBuffers(root, rootSize, i2, it);
        } else {
            makeMutable = makeMutable(root);
        }
        while (it.hasNext()) {
            this.rootShift += 5;
            makeMutable = mutableBufferWith(makeMutable);
            int i3 = this.rootShift;
            pushBuffers(makeMutable, 1 << i3, i3, it);
        }
        return makeMutable;
    }

    private final Object[] pushBuffers(Object[] root, int rootSize, int shift, Iterator buffersIterator) {
        if (!buffersIterator.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(shift >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (shift == 0) {
            return (Object[]) buffersIterator.next();
        }
        Object[] makeMutable = makeMutable(root);
        int indexSegment = UtilsKt.indexSegment(rootSize, shift);
        int i = shift - 5;
        makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], rootSize, i, buffersIterator);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i, buffersIterator);
        }
        return makeMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, Object element) {
        ListImplementation.checkPositionIndex$runtime(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (index >= rootSize) {
            insertIntoTail(this.root, index - rootSize, element);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }

    private final void insertIntoTail(Object[] root, int index, Object element) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            ArraysKt.copyInto(this.tail, makeMutable, index + 1, index, tailSize);
            makeMutable[index] = element;
            this.root = root;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.copyInto(objArr, makeMutable, index + 1, index, 31);
        makeMutable[index] = element;
        pushFilledTail(root, makeMutable, mutableBufferWith(obj));
    }

    private final Object[] insertIntoRoot(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
        Object obj;
        int indexSegment = UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            elementCarry.setValue(root[31]);
            Object[] copyInto = ArraysKt.copyInto(root, makeMutable(root), indexSegment + 1, indexSegment, 31);
            copyInto[indexSegment] = element;
            return copyInto;
        }
        Object[] makeMutable = makeMutable(root);
        int i = shift - 5;
        Object obj2 = makeMutable[indexSegment];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = insertIntoRoot((Object[]) obj2, i, index, element, elementCarry);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj = makeMutable[indexSegment]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj, i, 0, elementCarry.getValue(), elementCarry);
        }
        return makeMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection elements) {
        Object[] copyInto;
        ListImplementation.checkPositionIndex$runtime(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i = (index >> 5) << 5;
        int size = (((size() - i) + elements.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m1202assert(index >= rootSize());
            int i2 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] copyInto2 = ArraysKt.copyInto(objArr, makeMutable(objArr), size2 + 1, i2, tailSize());
            copyToBuffer(copyInto2, i2, elements.iterator());
            this.tail = copyInto2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + elements.size());
        if (index >= rootSize()) {
            copyInto = mutableBuffer();
            splitToBuffers(elements, index, this.tail, tailSize, objArr2, size, copyInto);
        } else if (tailSize2 > tailSize) {
            int i3 = tailSize2 - tailSize;
            copyInto = makeMutableShiftingRight(this.tail, i3);
            insertIntoRoot(elements, index, i3, objArr2, size, copyInto);
        } else {
            int i4 = tailSize - tailSize2;
            copyInto = ArraysKt.copyInto(this.tail, mutableBuffer(), 0, i4, tailSize);
            int i5 = 32 - i4;
            Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i5);
            int i6 = size - 1;
            objArr2[i6] = makeMutableShiftingRight;
            insertIntoRoot(elements, index, i5, objArr2, i6, makeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i, objArr2);
        this.tail = copyInto;
        this.size = size() + elements.size();
        return true;
    }

    private final void insertIntoRoot(Collection elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i = index >> 5;
        Object[] shiftLeafBuffers = shiftLeafBuffers(i, rightShift, buffers, nullBuffers, nextBuffer);
        int rootSize = nullBuffers - (((rootSize() >> 5) - 1) - i);
        if (rootSize < nullBuffers) {
            nextBuffer = buffers[rootSize];
            Intrinsics.checkNotNull(nextBuffer);
        }
        splitToBuffers(elements, index, shiftLeafBuffers, 32, buffers, rootSize, nextBuffer);
    }

    private final Object[] shiftLeafBuffers(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator leafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (leafBufferIterator.previousIndex() != startLeafIndex) {
            Object[] objArr = (Object[]) leafBufferIterator.previous();
            ArraysKt.copyInto(objArr, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = makeMutableShiftingRight(objArr, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return (Object[]) leafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] mutableBuffer;
        if (!(nullBuffers >= 1)) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] makeMutable = makeMutable(startBuffer);
        buffers[0] = makeMutable;
        int i = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i2 = (startBufferSize - i) + size;
        if (i2 < 32) {
            ArraysKt.copyInto(makeMutable, nextBuffer, size + 1, i, startBufferSize);
        } else {
            int i3 = i2 - 31;
            if (nullBuffers == 1) {
                mutableBuffer = makeMutable;
            } else {
                mutableBuffer = mutableBuffer();
                nullBuffers--;
                buffers[nullBuffers] = mutableBuffer;
            }
            int i4 = startBufferSize - i3;
            ArraysKt.copyInto(makeMutable, nextBuffer, 0, i4, startBufferSize);
            ArraysKt.copyInto(makeMutable, mutableBuffer, size + 1, i, i4);
            nextBuffer = mutableBuffer;
        }
        Iterator<E> it = elements.iterator();
        copyToBuffer(makeMutable, i, it);
        for (int i5 = 1; i5 < nullBuffers; i5++) {
            buffers[i5] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(nextBuffer, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int index) {
        ListImplementation.checkElementIndex$runtime(index, size());
        return bufferFor(index)[index & 31];
    }

    private final Object[] bufferFor(int index) {
        if (rootSize() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(index, i)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractMutableList
    public Object removeAt(int index) {
        ListImplementation.checkElementIndex$runtime(index, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (index >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, index - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, index, objectRef), rootSize, this.rootShift, 0);
        return objectRef.getValue();
    }

    private final Object removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        CommonFunctionsKt.m1202assert(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] copyInto = ArraysKt.copyInto(objArr, makeMutable(objArr), index, index + 1, size);
        copyInto[size - 1] = null;
        this.root = root;
        this.tail = copyInto;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int indexSegment = UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            Object obj = root[indexSegment];
            Object[] copyInto = ArraysKt.copyInto(root, makeMutable(root), indexSegment, indexSegment + 1, 32);
            copyInto[31] = tailCarry.getValue();
            tailCarry.setValue(obj);
            return copyInto;
        }
        int indexSegment2 = root[31] == null ? UtilsKt.indexSegment(rootSize() - 1, shift) : 31;
        Object[] makeMutable = makeMutable(root);
        int i = shift - 5;
        int i2 = indexSegment + 1;
        if (i2 <= indexSegment2) {
            while (true) {
                Object obj2 = makeMutable[indexSegment2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                makeMutable[indexSegment2] = removeFromRootAt((Object[]) obj2, i, 0, tailCarry);
                if (indexSegment2 == i2) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i, index, tailCarry);
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(root);
        Object[] pullLastBuffer = pullLastBuffer(root, shift, rootSize, objectRef);
        Intrinsics.checkNotNull(pullLastBuffer);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            this.rootShift = shift - 5;
        } else {
            this.root = pullLastBuffer;
            this.rootShift = shift;
        }
    }

    private final Object[] pullLastBuffer(Object[] root, int shift, int rootSize, ObjectRef tailCarry) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.setValue(root[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = root[indexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            pullLastBuffer = pullLastBuffer((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(root);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection elements) {
        return removeAllWithPredicate(new Function1() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean contains;
                contains = elements.contains(obj);
                return Boolean.valueOf(contains);
            }
        });
    }

    public final boolean removeAllWithPredicate(Function1 predicate) {
        boolean removeAll = removeAll(predicate);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    private final boolean removeAll(Function1 predicate) {
        Object[] pushBuffers;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(predicate, tailSize, objectRef) != tailSize;
        }
        ListIterator leafBufferIterator = leafBufferIterator(0);
        int i = 32;
        while (i == 32 && leafBufferIterator.hasNext()) {
            i = removeAll(predicate, (Object[]) leafBufferIterator.next(), 32, objectRef);
        }
        if (i == 32) {
            CommonFunctionsKt.m1202assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(predicate, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (leafBufferIterator.hasNext()) {
            i2 = recyclableRemoveAll(predicate, (Object[]) leafBufferIterator.next(), 32, i2, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int recyclableRemoveAll = recyclableRemoveAll(predicate, this.tail, tailSize, i2, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, recyclableRemoveAll, 32);
        if (arrayList.isEmpty()) {
            pushBuffers = this.root;
            Intrinsics.checkNotNull(pushBuffers);
        } else {
            pushBuffers = pushBuffers(this.root, i3, this.rootShift, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.root = retainFirst(pushBuffers, size);
        this.tail = objArr;
        this.size = size + recyclableRemoveAll;
        return true;
    }

    private final Object[] retainFirst(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i = size - 1;
        while (true) {
            int i2 = this.rootShift;
            if ((i >> i2) == 0) {
                this.rootShift = i2 - 5;
                Object[] objArr = root[0];
                Intrinsics.checkNotNull(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                root = objArr;
            } else {
                return nullifyAfter(root, i, i2);
            }
        }
    }

    private final Object[] nullifyAfter(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int indexSegment = UtilsKt.indexSegment(index, shift);
        Object obj = root[indexSegment];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object nullifyAfter = nullifyAfter((Object[]) obj, index, shift - 5);
        if (indexSegment < 31) {
            int i = indexSegment + 1;
            if (root[i] != null) {
                if (isMutable(root)) {
                    ArraysKt.fill(root, (Object) null, i, 32);
                }
                root = ArraysKt.copyInto(root, mutableBuffer(), 0, 0, i);
            }
        }
        if (nullifyAfter == root[indexSegment]) {
            return root;
        }
        Object[] makeMutable = makeMutable(root);
        makeMutable[indexSegment] = nullifyAfter;
        return makeMutable;
    }

    private final int removeAllFromTail(Function1 predicate, int tailSize, ObjectRef bufferRef) {
        int removeAll = removeAll(predicate, this.tail, tailSize, bufferRef);
        if (removeAll == tailSize) {
            CommonFunctionsKt.m1202assert(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, removeAll, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - removeAll);
        return removeAll;
    }

    private final int removeAll(Function1 predicate, Object[] buffer, int bufferSize, ObjectRef bufferRef) {
        Object[] objArr = buffer;
        int i = bufferSize;
        boolean z = false;
        for (int i2 = 0; i2 < bufferSize; i2++) {
            Object obj = buffer[i2];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr = makeMutable(buffer);
                    z = true;
                    i = i2;
                }
            } else if (z) {
                objArr[i] = obj;
                i++;
            }
        }
        bufferRef.setValue(objArr);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(Function1 predicate, Object[] buffer, int bufferSize, int toBufferSize, ObjectRef bufferRef, List recyclableBuffers, List buffers) {
        Object[] mutableBuffer;
        if (isMutable(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArr2 = objArr;
        for (int i = 0; i < bufferSize; i++) {
            Object obj = buffer[i];
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (toBufferSize == 32) {
                    if (!recyclableBuffers.isEmpty()) {
                        mutableBuffer = (Object[]) recyclableBuffers.remove(recyclableBuffers.size() - 1);
                    } else {
                        mutableBuffer = mutableBuffer();
                    }
                    objArr2 = mutableBuffer;
                    toBufferSize = 0;
                }
                objArr2[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.setValue(objArr2);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int index, Object element) {
        ListImplementation.checkElementIndex$runtime(index, size());
        if (rootSize() <= index) {
            Object[] makeMutable = makeMutable(this.tail);
            if (makeMutable != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i = index & 31;
            Object obj = makeMutable[i];
            makeMutable[i] = element;
            this.tail = makeMutable;
            return obj;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        this.root = setInRoot(objArr, this.rootShift, index, element, objectRef);
        return objectRef.getValue();
    }

    private final Object[] setInRoot(Object[] root, int shift, int index, Object e, ObjectRef oldElementCarry) {
        int indexSegment = UtilsKt.indexSegment(index, shift);
        Object[] makeMutable = makeMutable(root);
        if (shift == 0) {
            if (makeMutable != root) {
                ((AbstractList) this).modCount++;
            }
            oldElementCarry.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = setInRoot((Object[]) obj, shift - 5, index, e, oldElementCarry);
        return makeMutable;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime(index, size());
        return new PersistentVectorMutableIterator(this, index);
    }

    private final ListIterator leafBufferIterator(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int rootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime(index, rootSize);
        int i = this.rootShift;
        if (i == 0) {
            return new SingleElementListIterator(objArr, index);
        }
        return new TrieIterator(objArr, index, rootSize, i / 5);
    }
}
