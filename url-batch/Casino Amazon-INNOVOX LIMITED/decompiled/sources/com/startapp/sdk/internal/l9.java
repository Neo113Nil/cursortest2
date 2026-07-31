package com.startapp.sdk.internal;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l9 extends a6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(Context context) {
        super(context);
        context.getClass();
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        inputMethodSubtype.getClass();
        return k9.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.a6
    public final /* bridge */ /* synthetic */ Object c() {
        return j9.b;
    }

    @Override // com.startapp.sdk.internal.a6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final j9 a() {
        Object systemService = this.f165a.getSystemService("input_method");
        final InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return null;
        }
        InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
        Sequence sequenceOf = SequencesKt.sequenceOf(currentInputMethodSubtype != null ? k9.a(currentInputMethodSubtype) : null);
        List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
        inputMethodList.getClass();
        Set set = SequencesKt.toSet(SequencesKt.take(SequencesKt.filter(SequencesKt.filterNotNull(SequencesKt.plus(sequenceOf, SequencesKt.map(SequencesKt.filter(SequencesKt.flattenSequenceOfIterable(SequencesKt.map(CollectionsKt.asSequence(inputMethodList), new Function1() { // from class: com.startapp.sdk.internal.l9$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l9.a(inputMethodManager, (InputMethodInfo) obj);
            }
        })), new Function1() { // from class: com.startapp.sdk.internal.l9$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l9.a((InputMethodSubtype) obj));
            }
        }), new Function1() { // from class: com.startapp.sdk.internal.l9$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l9.b((InputMethodSubtype) obj);
            }
        }))), new Function1() { // from class: com.startapp.sdk.internal.l9$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l9.a((String) obj));
            }
        }), 10));
        if (set.isEmpty()) {
            return null;
        }
        return new j9(set);
    }

    public static final List a(InputMethodManager inputMethodManager, InputMethodInfo inputMethodInfo) {
        return inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return Intrinsics.areEqual("keyboard", inputMethodSubtype.getMode());
    }

    public static final boolean a(String str) {
        str.getClass();
        return str.length() > 0;
    }
}
