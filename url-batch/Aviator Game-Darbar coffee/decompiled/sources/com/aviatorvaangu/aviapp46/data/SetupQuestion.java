package com.aviatorvaangu.aviapp46.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/aviatorvaangu/aviapp46/data/SetupQuestion;", "", "question", "", "subtitle", "options", "", "inputPlaceholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getQuestion", "()Ljava/lang/String;", "getSubtitle", "getOptions", "()Ljava/util/List;", "getInputPlaceholder", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final /* data */ class SetupQuestion {
    public static final int $stable = 8;
    private final String inputPlaceholder;
    private final List<String> options;
    private final String question;
    private final String subtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetupQuestion copy$default(SetupQuestion setupQuestion, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setupQuestion.question;
        }
        if ((i & 2) != 0) {
            str2 = setupQuestion.subtitle;
        }
        if ((i & 4) != 0) {
            list = setupQuestion.options;
        }
        if ((i & 8) != 0) {
            str3 = setupQuestion.inputPlaceholder;
        }
        return setupQuestion.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> component3() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    public final SetupQuestion copy(String question, String subtitle, List<String> options, String inputPlaceholder) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(options, "options");
        return new SetupQuestion(question, subtitle, options, inputPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupQuestion)) {
            return false;
        }
        SetupQuestion setupQuestion = (SetupQuestion) other;
        return Intrinsics.areEqual(this.question, setupQuestion.question) && Intrinsics.areEqual(this.subtitle, setupQuestion.subtitle) && Intrinsics.areEqual(this.options, setupQuestion.options) && Intrinsics.areEqual(this.inputPlaceholder, setupQuestion.inputPlaceholder);
    }

    public int hashCode() {
        int hashCode = ((((this.question.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.options.hashCode()) * 31;
        String str = this.inputPlaceholder;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SetupQuestion(question=" + this.question + ", subtitle=" + this.subtitle + ", options=" + this.options + ", inputPlaceholder=" + this.inputPlaceholder + ")";
    }

    public SetupQuestion(String question, String subtitle, List<String> options, String str) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(options, "options");
        this.question = question;
        this.subtitle = subtitle;
        this.options = options;
        this.inputPlaceholder = str;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public /* synthetic */ SetupQuestion(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3);
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }
}
