package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutor;
import kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext;
import kotlin.text.CharsKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.InlineList;
import okhttp3.MediaType;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class UnsignedKt {
    public static KTypeSubstitutor create(KType kType) {
        kType.getClass();
        ReflectTypeSystemContext reflectTypeSystemContext = ReflectTypeSystemContext.INSTANCE;
        TypeConstructorMarker typeConstructor = reflectTypeSystemContext.typeConstructor((RigidTypeMarker) kType);
        int parametersCount = reflectTypeSystemContext.parametersCount(typeConstructor);
        ArrayList arrayList = new ArrayList(parametersCount);
        for (int i = 0; i < parametersCount; i++) {
            arrayList.add((KTypeParameterBase) reflectTypeSystemContext.getParameter(typeConstructor, i));
        }
        return !arrayList.isEmpty() ? new KTypeSubstitutor(MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList, kType.getArguments()))) : KTypeSubstitutor.EMPTY;
    }

    public static View findPressedView$papa_release(ViewGroup viewGroup) {
        View findPressedView$papa_release;
        if (viewGroup.isPressed()) {
            return viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.isPressed()) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (findPressedView$papa_release = findPressedView$papa_release((ViewGroup) childAt)) != null) {
                return findPressedView$papa_release;
            }
        }
        return null;
    }

    public static MediaType get(String str) {
        str.getClass();
        MatcherMatchResult matchAt = MediaType.TYPE_SUBTYPE.matchAt(0, str);
        if (matchAt == null) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((MatcherMatchResult$groupValues$1) matchAt.getGroupValues()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((MatcherMatchResult$groupValues$1) matchAt.getGroupValues()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = matchAt.getRange().last;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            MatcherMatchResult matchAt2 = MediaType.PARAMETER.matchAt(i2, str);
            if (matchAt2 == null) {
                Path$$ExternalSyntheticBUOutline0.m(34, str.substring(i2), "\" for: \"", str, "Parameter is not formatted correctly: \"");
                return null;
            }
            MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = matchAt2.groups;
            MatchGroup matchGroup = matcherMatchResult$groups$1.get(1);
            String str3 = matchGroup != null ? matchGroup.value : null;
            if (str3 == null) {
                i = matchAt2.getRange().last;
            } else {
                MatchGroup matchGroup2 = matcherMatchResult$groups$1.get(2);
                String str4 = matchGroup2 != null ? matchGroup2.value : null;
                if (str4 == null) {
                    MatchGroup matchGroup3 = matcherMatchResult$groups$1.get(3);
                    matchGroup3.getClass();
                    str4 = matchGroup3.value;
                } else if (StringsKt.startsWith$default(str4, '\'') && StringsKt.endsWith$default(str4, '\'') && str4.length() > 2) {
                    str4 = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str4);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = matchAt2.getRange().last;
            }
        }
    }

    public static final void startCoroutineCancellable(Function2 function2, AbstractCoroutine abstractCoroutine, AbstractCoroutine abstractCoroutine2) {
        try {
            Continuation intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(abstractCoroutine, abstractCoroutine2, function2));
            Result.Companion companion = Result.Companion;
            InlineList.resumeCancellableWithInternal(Unit.INSTANCE, intercepted);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).cause;
            }
            Result.Companion companion2 = Result.Companion;
            abstractCoroutine2.resumeWith(SafeTrace.createFailure(th));
            throw th;
        }
    }

    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String ulongToString(int i, long j) {
        if (j >= 0) {
            String l = Long.toString(j, CharsKt.checkRadix(i));
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, CharsKt.checkRadix(i));
        l2.getClass();
        sb.append(l2);
        String l3 = Long.toString(j4, CharsKt.checkRadix(i));
        l3.getClass();
        sb.append(l3);
        return sb.toString();
    }

    public abstract List clean(String str, List list);
}
