package com.squareup.workflow1;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.AttributeRange;
import app.cash.arcade.values.AttributedString;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.markdownparser.MarkdownParserKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/workflow1/Worker;", "OutputT", "", "Companion", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Worker<OutputT> {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        static {
            Reflection.typeOf(Void.class);
        }
    }

    boolean doesSameWorkAs(Worker worker);

    Flow run();

    /* loaded from: classes4.dex */
    public abstract class DefaultImpls {
        public static final void appendMarkdown(AnnotatedString.Builder builder, String str, MarkdownSpanValues markdownSpanValues, Function2 function2) {
            str.getClass();
            markdownSpanValues.getClass();
            builder.append(toAnnotatedString(MarkdownParserKt.parseMarkdownWith(str, MarkdownParserKt.inlineMarkdownRegex), markdownSpanValues, function2));
        }

        public static void appendMarkdown$default(AnnotatedString.Builder builder, String str, Function2 function2, int i) {
            MarkdownSpanValues markdownSpanValues = MarkdownSpanValues.Default;
            if ((i & 4) != 0) {
                function2 = null;
            }
            appendMarkdown(builder, str, markdownSpanValues, function2);
        }

        public static boolean doesSameWorkAs(Worker worker, Worker worker2) {
            worker2.getClass();
            Class<?> cls = worker2.getClass();
            ReflectionFactory reflectionFactory = Reflection.factory;
            return reflectionFactory.getOrCreateKotlinClass(cls).equals(reflectionFactory.getOrCreateKotlinClass(worker.getClass()));
        }

        public static TelemetryDebugEvent.Device fromJsonObject(JsonObject jsonObject) {
            try {
                JsonElement jsonElement = jsonObject.get("architecture");
                String asString = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get("brand");
                String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("model");
                return new TelemetryDebugEvent.Device(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e3);
                return null;
            }
        }

        public static final AttributedString getInlineText(String str, int i, int i2, List list) {
            CharSequence charSequence;
            if (i >= i2) {
                return null;
            }
            String substring = str.substring(i, i2);
            if (StringsKt.isBlank(substring)) {
                return null;
            }
            String obj = StringsKt.trimStart(substring).toString();
            int length = substring.length() - obj.length();
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (!CharsKt.isWhitespace(obj.charAt(length2))) {
                        charSequence = obj.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
            charSequence = "";
            String obj2 = charSequence.toString();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                AttributeRange attributeRange = (AttributeRange) obj3;
                if (attributeRange.beginIndexInclusive >= i && attributeRange.endIndexExclusive < i2) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AttributeRange attributeRange2 = (AttributeRange) it.next();
                int i4 = (attributeRange2.beginIndexInclusive - i) - length;
                int length3 = obj2.length();
                if (i4 > length3) {
                    i4 = length3;
                }
                int i5 = (attributeRange2.endIndexExclusive - i) - length;
                int length4 = obj2.length();
                if (i5 > length4) {
                    i5 = length4;
                }
                Attribute attribute = attributeRange2.attribute;
                attribute.getClass();
                arrayList2.add(new AttributeRange(i4, i5, attribute));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                AttributeRange attributeRange3 = (AttributeRange) next;
                if (attributeRange3.beginIndexInclusive < attributeRange3.endIndexExclusive) {
                    arrayList3.add(next);
                }
            }
            return new AttributedString(obj2, arrayList3);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0107 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final AnnotatedString toAnnotatedString(AttributedString attributedString, MarkdownSpanValues markdownSpanValues, final Function2 function2) {
            SpanStyle spanStyle;
            int i;
            SpanStyle spanStyle2;
            final AttributedString attributedString2 = attributedString;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(attributedString2.text);
            Iterator it = attributedString2.attributeRanges.iterator();
            while (true) {
                spanStyle = null;
                i = 14;
                if (!it.hasNext()) {
                    break;
                }
                AttributeRange attributeRange = (AttributeRange) it.next();
                final int i2 = attributeRange.beginIndexInclusive;
                final int i3 = attributeRange.endIndexExclusive;
                final Attribute attribute = attributeRange.attribute;
                if (Intrinsics.areEqual(attribute, Attribute.Bold.INSTANCE)) {
                    spanStyle = markdownSpanValues.boldSpan;
                    if (spanStyle == null) {
                        spanStyle2 = new SpanStyle(0L, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531);
                        spanStyle = spanStyle2;
                    }
                    if (spanStyle != null) {
                        builder.addStyle(spanStyle, i2, i3);
                    }
                    attributedString2 = attributedString;
                } else {
                    if (Intrinsics.areEqual(attribute, Attribute.StrikeThrough.INSTANCE)) {
                        spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61439);
                    } else {
                        if (attribute instanceof Attribute.Link) {
                            spanStyle2 = markdownSpanValues.linkSpan;
                            SpanStyle spanStyle3 = spanStyle2 != null ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.m675copywmQWz5c$default(0.25f, spanStyle2.textForegroundStyle.mo1007getColor0d7_KjU(), 14), (TextDecoration) null, (Shadow) null, 63487) : new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.m675copywmQWz5c$default(0.25f, Color.Black, 14), (TextDecoration) null, (Shadow) null, 63487);
                            final int i4 = 0;
                            builder.addLink(new LinkAnnotation.Url(((Attribute.Link) attribute).url, new TextLinkStyles(spanStyle2, spanStyle3, spanStyle3, spanStyle3), new LinkInteractionListener() { // from class: com.squareup.cash.composeUi.foundation.text.MarkdownKt$$ExternalSyntheticLambda0
                                @Override // androidx.compose.ui.text.LinkInteractionListener
                                public final void onClick(LinkAnnotation linkAnnotation) {
                                    int i5 = i4;
                                    int i6 = i3;
                                    int i7 = i2;
                                    Object obj = attributedString2;
                                    Object obj2 = attribute;
                                    Function2 function22 = function2;
                                    switch (i5) {
                                        case 0:
                                            Attribute attribute2 = (Attribute) obj2;
                                            AttributedString attributedString3 = (AttributedString) obj;
                                            linkAnnotation.getClass();
                                            if (function22 != null) {
                                                function22.invoke(((Attribute.Link) attribute2).url, attributedString3.text.substring(i7, i6));
                                                break;
                                            }
                                            break;
                                        default:
                                            URLSpan uRLSpan = (URLSpan) obj2;
                                            SpannableString spannableString = (SpannableString) obj;
                                            linkAnnotation.getClass();
                                            if (function22 != null) {
                                                String url = uRLSpan.getURL();
                                                url.getClass();
                                                function22.invoke(url, spannableString.subSequence(i7, i6).toString());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }), i2, i3);
                        }
                        if (spanStyle != null) {
                        }
                        attributedString2 = attributedString;
                    }
                    spanStyle = spanStyle2;
                    if (spanStyle != null) {
                    }
                    attributedString2 = attributedString;
                }
            }
            SpannableString spannableString = new SpannableString(builder.toAnnotatedString());
            if (Linkify.addLinks(spannableString, 1)) {
                int i5 = 0;
                Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                spans.getClass();
                int length = spans.length;
                while (i5 < length) {
                    final URLSpan uRLSpan = (URLSpan) spans[i5];
                    final int spanStart = spannableString.getSpanStart(uRLSpan);
                    final int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    url.getClass();
                    final int i6 = 1;
                    final SpannableString spannableString2 = spannableString;
                    builder.addLink(new LinkAnnotation.Url(url, new TextLinkStyles(markdownSpanValues.linkSpan, spanStyle, spanStyle, i), new LinkInteractionListener() { // from class: com.squareup.cash.composeUi.foundation.text.MarkdownKt$$ExternalSyntheticLambda0
                        @Override // androidx.compose.ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation linkAnnotation) {
                            int i52 = i6;
                            int i62 = spanEnd;
                            int i7 = spanStart;
                            Object obj = spannableString2;
                            Object obj2 = uRLSpan;
                            Function2 function22 = function2;
                            switch (i52) {
                                case 0:
                                    Attribute attribute2 = (Attribute) obj2;
                                    AttributedString attributedString3 = (AttributedString) obj;
                                    linkAnnotation.getClass();
                                    if (function22 != null) {
                                        function22.invoke(((Attribute.Link) attribute2).url, attributedString3.text.substring(i7, i62));
                                        break;
                                    }
                                    break;
                                default:
                                    URLSpan uRLSpan2 = (URLSpan) obj2;
                                    SpannableString spannableString3 = (SpannableString) obj;
                                    linkAnnotation.getClass();
                                    if (function22 != null) {
                                        String url2 = uRLSpan2.getURL();
                                        url2.getClass();
                                        function22.invoke(url2, spannableString3.subSequence(i7, i62).toString());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }), spanStart, spanEnd);
                    i5++;
                    spannableString = spannableString2;
                }
            }
            return builder.toAnnotatedString();
        }

        public static final void appendMarkdown(AnnotatedString.Builder builder, String str, SpanStyle spanStyle, Function2 function2) {
            str.getClass();
            appendMarkdown(builder, str, new MarkdownSpanValues(spanStyle, 2), function2);
        }
    }
}
