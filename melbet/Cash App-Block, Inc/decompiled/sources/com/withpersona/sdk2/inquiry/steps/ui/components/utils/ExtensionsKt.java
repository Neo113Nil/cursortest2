package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import io.noties.markwon.MarkwonImpl;
import io.noties.markwon.core.spans.LinkSpan;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* loaded from: classes9.dex */
public abstract class ExtensionsKt {
    public static MarkwonImpl markwon;

    public static final UiComponent findFirstComponentOrNull(List list, KClass kClass, Function1 function1) {
        UiComponent findFirstComponentOrNull;
        list.getClass();
        kClass.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = (UiComponent) it.next();
            if (kClass.isInstance(uiComponent)) {
                uiComponent.getClass();
                if (((Boolean) function1.invoke(uiComponent)).booleanValue()) {
                    return uiComponent;
                }
            } else if ((uiComponent instanceof UiComponentGroup) && (findFirstComponentOrNull = findFirstComponentOrNull(((UiComponentGroup) uiComponent).getChildren(), kClass, function1)) != null) {
                return findFirstComponentOrNull;
            }
        }
        return null;
    }

    public static final void setMarkdown(TextView textView, String str) {
        textView.getClass();
        str.getClass();
        Context context = textView.getContext();
        context.getClass();
        MarkwonImpl markwonImpl = markwon;
        if (markwonImpl == null) {
            markwonImpl = MarkwonImpl.create(context);
            markwon = markwonImpl;
        }
        setParsedMarkdown(textView, markwonImpl.toMarkdown(str));
    }

    public static final void setParsedMarkdown(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        MarkwonImpl markwonImpl = markwon;
        if (markwonImpl == null) {
            markwonImpl = MarkwonImpl.create(context);
            markwon = markwonImpl;
        }
        markwonImpl.setParsedMarkdown(textView, spannableStringBuilder);
        if (spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), LinkSpan.class).length == 0 && spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class).length == 0) {
            textView.setMovementMethod(null);
        }
    }
}
