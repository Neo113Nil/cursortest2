package androidx.activity;

import android.view.View;
import f6.l;
import kotlin.jvm.internal.s;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        m generateSequence;
        m mapNotNull;
        Object firstOrNull;
        s.checkNotNullParameter(view, "<this>");
        generateSequence = SequencesKt__SequencesKt.generateSequence(view, new l() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1
            @Override // f6.l
            public final View invoke(View it) {
                s.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        });
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(generateSequence, new l() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
            @Override // f6.l
            public final OnBackPressedDispatcherOwner invoke(View it) {
                s.checkNotNullParameter(it, "it");
                Object tag = it.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof OnBackPressedDispatcherOwner) {
                    return (OnBackPressedDispatcherOwner) tag;
                }
                return null;
            }
        });
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (OnBackPressedDispatcherOwner) firstOrNull;
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        s.checkNotNullParameter(view, "<this>");
        s.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
