package com.withpersona.sdk2.inquiry.modal;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.modal.ModalViewContainer;
import com.withpersona.sdk2.inquiry.shared.WindowUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes9.dex */
public final class CustomModalViewContainer extends ModalViewContainer {
    public static final UiScreenRunner.Companion Companion = new UiScreenRunner.Companion(6);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CustomModalViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
    }

    @Override // com.squareup.workflow1.ui.modal.ModalViewContainer
    public final Dialog buildDialogForView(View view) {
        Object obj;
        Dialog dialog = new Dialog(getContext(), R.style.Persona_Inquiry2_DialogFullscreen);
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList.push(view);
        while (!linkedList.isEmpty()) {
            Object pollLast = linkedList.pollLast();
            if (pollLast == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            View view2 = (View) pollLast;
            if (view2 instanceof ViewGroup) {
                Iterator it = CollectionsKt.reversed(SequencesKt___SequencesKt.toList(new ViewGroupKt$children$1((ViewGroup) view2))).iterator();
                while (it.hasNext()) {
                    linkedList.push((View) it.next());
                }
            }
            if (!view2.equals(view)) {
                arrayList.add(view2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((View) obj).getTag(R.id.pi2_background_color_hint) instanceof Integer) {
                break;
            }
        }
        View view3 = (View) obj;
        Object tag = view3 != null ? view3.getTag(R.id.pi2_background_color_hint) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                WindowUtilsKt.updateUiColor(window, num.intValue());
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            Trace.setDecorFitsSystemWindows(window, false);
            if (!InsetsUtilsKt.supportsCustomNavigationBar) {
                window.setNavigationBarColor(-16777216);
            }
        }
        return dialog;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomModalViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomModalViewContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomModalViewContainer(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
