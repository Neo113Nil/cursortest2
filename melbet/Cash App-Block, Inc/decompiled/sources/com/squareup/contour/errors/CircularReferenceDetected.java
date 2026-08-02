package com.squareup.contour.errors;

import android.view.View;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.SystemProperties;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/contour/errors/CircularReferenceDetected;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "TraceElement", "contour_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class CircularReferenceDetected extends Exception {
    public final ArrayList list = new ArrayList();

    /* loaded from: classes6.dex */
    public final class TraceElement {
        public final StackTraceElement referencedFrom;
        public final StackTraceElement seenAt;
        public final View view;

        public TraceElement(View view, StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
            view.getClass();
            this.view = view;
            this.seenAt = stackTraceElement;
            this.referencedFrom = stackTraceElement2;
        }

        public final StackTraceElement getReferencedFrom() {
            return this.referencedFrom;
        }

        public final StackTraceElement getSeenAt() {
            return this.seenAt;
        }

        public final View getView() {
            return this.view;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.list;
        int size = arrayList.size();
        String str = SystemProperties.LINE_SEPARATOR;
        Boxes$$ExternalSyntheticOutline1.m(sb, str, str, "Circular reference detected through the following calls:", str);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            TraceElement traceElement = (TraceElement) next;
            String str3 = (size - i) + ") ";
            String repeat = StringsKt__StringsJVMKt.repeat(str3.length(), " ");
            sb.append(str3);
            StringBuilder sb2 = new StringBuilder("Calling ");
            StackTraceElement seenAt = traceElement.getSeenAt();
            if (seenAt != null) {
                str2 = seenAt.getMethodName();
            }
            sb2.append(str2);
            sb2.append("() on ");
            sb2.append(traceElement.getView());
            sb2.append(" from:");
            sb.append(sb2.toString());
            String str4 = SystemProperties.LINE_SEPARATOR;
            sb.append(str4);
            sb.append(repeat);
            sb.append(String.valueOf(traceElement.getReferencedFrom()));
            sb.append(str4);
            i = i2;
        }
        return sb.toString();
    }
}
