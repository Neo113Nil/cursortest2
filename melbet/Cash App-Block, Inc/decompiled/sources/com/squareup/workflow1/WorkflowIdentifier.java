package com.squareup.workflow1;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.EOFException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.e3;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class WorkflowIdentifier {
    public final Function0 description;
    public final WorkflowIdentifier proxiedIdentifier;
    public final Sequence proxiedIdentifiers;

    /* renamed from: type, reason: collision with root package name */
    public final KAnnotatedElement f1421type;
    public final Lazy typeName$delegate;

    public WorkflowIdentifier(KAnnotatedElement kAnnotatedElement, WorkflowIdentifier workflowIdentifier, ScannerView.AnonymousClass1 anonymousClass1) {
        kAnnotatedElement.getClass();
        this.f1421type = kAnnotatedElement;
        this.proxiedIdentifier = workflowIdentifier;
        this.description = anonymousClass1;
        if (!(kAnnotatedElement instanceof KClass) && (!(kAnnotatedElement instanceof KType) || !(((KType) kAnnotatedElement).getClassifier() instanceof KClass))) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Intrinsics.stringPlus(kAnnotatedElement, "Expected type to be either a KClass or a KType with a KClass classifier, but was "));
            throw null;
        }
        this.typeName$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new e3(this, 6));
        this.proxiedIdentifiers = SequencesKt__SequencesKt.generateSequence(WorkflowIdentifier$toString$1.INSTANCE$1, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowIdentifier)) {
            return false;
        }
        WorkflowIdentifier workflowIdentifier = (WorkflowIdentifier) obj;
        return Intrinsics.areEqual(this.f1421type, workflowIdentifier.f1421type) && Intrinsics.areEqual(this.proxiedIdentifier, workflowIdentifier.proxiedIdentifier);
    }

    public final int hashCode() {
        int hashCode = this.f1421type.hashCode() * 31;
        WorkflowIdentifier workflowIdentifier = this.proxiedIdentifier;
        return hashCode + (workflowIdentifier == null ? 0 : workflowIdentifier.hashCode());
    }

    public final ByteString toByteStringOrNull() {
        ByteString byteString;
        if (this.f1421type instanceof KClass) {
            WorkflowIdentifier workflowIdentifier = this.proxiedIdentifier;
            if (workflowIdentifier != null) {
                ByteString byteStringOrNull = workflowIdentifier.toByteStringOrNull();
                byteString = byteStringOrNull != null ? byteStringOrNull : null;
            }
            Buffer buffer = new Buffer();
            Object value = this.typeName$delegate.getValue();
            value.getClass();
            ByteString.Companion companion = ByteString.Companion;
            Snapshots.writeByteStringWithLength(buffer, ByteString.Companion.encodeUtf8((String) value));
            if (byteString != null) {
                buffer.m4335writeByte(1);
                buffer.m4333write(byteString);
            } else {
                buffer.m4335writeByte(0);
            }
            return buffer.readByteString(buffer.size);
        }
        return null;
    }

    public final String toString() {
        Function0 function0 = this.description;
        String str = function0 == null ? null : (String) function0.invoke();
        return str == null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(')', "WorkflowIdentifier(", SequencesKt___SequencesKt.joinToString$default(this.proxiedIdentifiers, null, 31)) : str;
    }

    /* loaded from: classes6.dex */
    public abstract class Companion {
        public static final AnnotatedString doBalancing(AnnotatedString annotatedString, int i, int i2, TextStyle textStyle, GapComposer gapComposer) {
            Object verifyCheckDepositKt$$ExternalSyntheticLambda14;
            AnnotatedString annotatedString2;
            int lastIndexOf$default;
            float f;
            annotatedString.getClass();
            textStyle.getClass();
            gapComposer.startReplaceGroup(1993664446);
            if (i == 0) {
                gapComposer.end(false);
                return annotatedString;
            }
            if (StringsKt.contains((CharSequence) annotatedString, (CharSequence) "\n", false)) {
                gapComposer.end(false);
                return annotatedString;
            }
            List list = annotatedString.paragraphStylesOrNull;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            if (!list.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$3("Paragraph styles are unsupported for balanced text");
                return null;
            }
            int i3 = Strings.m3985ParagraphUl8oQg4$default(annotatedString.text, textStyle, ConstraintsKt.Constraints$default(0, i, 0, 0, 13), (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity), (FontFamilyResolverImpl) gapComposer.consume(CompositionLocalsKt.LocalFontFamilyResolver), annotatedString.getSpanStyles(), 0, 448).layout.lineCount;
            if (i3 >= i2) {
                i2 = i3;
            }
            if (i2 < 2) {
                gapComposer.end(false);
                return annotatedString;
            }
            float measuredLength = measuredLength(annotatedString, textStyle, gapComposer) / i2;
            int length = annotatedString.text.length();
            int i4 = i2 - 1;
            gapComposer.startReplaceGroup(1735195117);
            AnnotatedString annotatedString3 = annotatedString;
            int i5 = length;
            while (i4 > 0) {
                gapComposer.startReplaceGroup(1996822068);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) gapComposer.consume(CompositionLocalsKt.LocalFontFamilyResolver);
                boolean changed = gapComposer.changed(annotatedString) | gapComposer.changed(textStyle) | gapComposer.changed(density) | gapComposer.changedInstance(fontFamilyResolverImpl);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    annotatedString2 = annotatedString;
                    verifyCheckDepositKt$$ExternalSyntheticLambda14 = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(annotatedString2, textStyle, density, fontFamilyResolverImpl, 18);
                    gapComposer.updateRememberedValue(verifyCheckDepositKt$$ExternalSyntheticLambda14);
                } else {
                    verifyCheckDepositKt$$ExternalSyntheticLambda14 = rememberedValue;
                    annotatedString2 = annotatedString;
                }
                Function2 function2 = (Function2) verifyCheckDepositKt$$ExternalSyntheticLambda14;
                function2.getClass();
                int i6 = 0;
                int i7 = i5;
                while (i6 < i7) {
                    int i8 = (i6 + i7) / 2;
                    if (((Number) function2.invoke(Integer.valueOf(i5 - i8), Integer.valueOf(i5))).floatValue() > measuredLength) {
                        i7 = i8;
                    } else {
                        i6 = i8 + 1;
                    }
                }
                int i9 = i5 - i6;
                if (i9 == 0) {
                    gapComposer.end(false);
                    lastIndexOf$default = -1;
                } else {
                    lastIndexOf$default = StringsKt.lastIndexOf$default(' ', i9, 4, (CharSequence) annotatedString2);
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) annotatedString2, ' ', i9, false, 4);
                    if (indexOf$default != i5) {
                        float f2 = Float.MAX_VALUE;
                        if (lastIndexOf$default != -1) {
                            gapComposer.startReplaceGroup(2030900457);
                            f = measuredLength(annotatedString2.subSequence(lastIndexOf$default, i5), textStyle, gapComposer);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(2031004369);
                            gapComposer.end(false);
                            f = Float.MAX_VALUE;
                        }
                        if (indexOf$default != -1) {
                            gapComposer.startReplaceGroup(2031100872);
                            f2 = measuredLength(annotatedString2.subSequence(indexOf$default, i5), textStyle, gapComposer);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(2031205745);
                            gapComposer.end(false);
                        }
                        if (Math.abs(measuredLength - f) >= Math.abs(measuredLength - f2)) {
                            lastIndexOf$default = indexOf$default;
                        }
                    }
                    gapComposer.end(false);
                }
                if (measuredLength(annotatedString2.subSequence(lastIndexOf$default, i5), textStyle, gapComposer) >= i) {
                    i4--;
                }
                if (lastIndexOf$default != -1) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(annotatedString3.subSequence(0, lastIndexOf$default));
                    builder.append('\n');
                    builder.append(annotatedString3.subSequence(lastIndexOf$default + 1, annotatedString3.text.length()));
                    annotatedString3 = builder.toAnnotatedString();
                    i4--;
                    annotatedString = annotatedString2;
                    i5 = lastIndexOf$default;
                } else {
                    annotatedString = annotatedString2;
                }
            }
            gapComposer.end(false);
            gapComposer.end(false);
            return annotatedString3;
        }

        public static TelemetryDebugEvent.Os fromJsonObject(JsonObject jsonObject) {
            try {
                JsonElement jsonElement = jsonObject.get("build");
                String asString = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get("name");
                String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("version");
                return new TelemetryDebugEvent.Os(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e3);
                return null;
            }
        }

        public static final float measuredLength(AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamilyResolverImpl fontFamilyResolverImpl) {
            List list = annotatedString.paragraphStylesOrNull;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            if (list.isEmpty()) {
                return Strings.m3985ParagraphUl8oQg4$default(annotatedString.text, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), density, fontFamilyResolverImpl, annotatedString.getSpanStyles(), 0, 448).paragraphIntrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
            }
            a$$ExternalSyntheticBUOutline0.m$3("Paragraph styles are unsupported for balanced text");
            return RecyclerView.DECELERATION_RATE;
        }

        public static WorkflowIdentifier parse(ByteString byteString) {
            WorkflowIdentifier parse;
            byteString.getClass();
            Buffer buffer = new Buffer();
            buffer.m4333write(byteString);
            try {
                String utf8 = Snapshots.readByteStringWithLength(buffer).utf8();
                byte readByte = buffer.readByte();
                if (readByte == 0) {
                    parse = null;
                } else {
                    if (readByte != 1) {
                        throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                    }
                    parse = parse(buffer.readByteString(buffer.size));
                }
                return new WorkflowIdentifier(Reflection.factory.getOrCreateKotlinClass(Class.forName(utf8)), parse, 4);
            } catch (EOFException unused) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid WorkflowIdentifier");
                return null;
            }
        }

        public static final float measuredLength(AnnotatedString annotatedString, TextStyle textStyle, GapComposer gapComposer) {
            return measuredLength(annotatedString, textStyle, (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity), (FontFamilyResolverImpl) gapComposer.consume(CompositionLocalsKt.LocalFontFamilyResolver));
        }
    }

    public /* synthetic */ WorkflowIdentifier(KAnnotatedElement kAnnotatedElement, WorkflowIdentifier workflowIdentifier, int i) {
        this(kAnnotatedElement, (i & 2) != 0 ? null : workflowIdentifier, (ScannerView.AnonymousClass1) null);
    }
}
