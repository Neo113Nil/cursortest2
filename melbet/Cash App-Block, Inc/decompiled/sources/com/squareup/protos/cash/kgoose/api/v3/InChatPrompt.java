package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InChatPrompt;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/InChatPrompt$Builder;", "", "body_text", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "prompt", "category", "id", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InChatPrompt extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InChatPrompt> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 1, tag = 2)
    public final UiAvatar avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String body_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String prompt;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InChatPrompt$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/InChatPrompt;", "<init>", "()V", "body_text", "", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "prompt", "category", "id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public UiAvatar avatar;
        public String body_text;
        public String category;
        public String id;
        public String prompt;

        public final Builder avatar(UiAvatar avatar) {
            this.avatar = avatar;
            return this;
        }

        public final Builder body_text(String body_text) {
            this.body_text = body_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public InChatPrompt build() {
            return new InChatPrompt(this.avatar, this.body_text, this.prompt, this.category, this.id, buildUnknownFields());
        }

        public final Builder category(String category) {
            this.category = category;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
    }

    static {
        InChatPrompt$Companion$ADAPTER$1 inChatPrompt$Companion$ADAPTER$1 = new InChatPrompt$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InChatPrompt.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.InChatPrompt", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_inchat_prompts.proto");
        ADAPTER = inChatPrompt$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inChatPrompt$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InChatPrompt(UiAvatar uiAvatar, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.body_text = str;
        this.avatar = uiAvatar;
        this.prompt = str2;
        this.category = str3;
        this.id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InChatPrompt)) {
            return false;
        }
        InChatPrompt inChatPrompt = (InChatPrompt) obj;
        return Intrinsics.areEqual(unknownFields(), inChatPrompt.unknownFields()) && Intrinsics.areEqual(this.body_text, inChatPrompt.body_text) && Intrinsics.areEqual(this.avatar, inChatPrompt.avatar) && Intrinsics.areEqual(this.prompt, inChatPrompt.prompt) && Intrinsics.areEqual(this.category, inChatPrompt.category) && Intrinsics.areEqual(this.id, inChatPrompt.id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.body_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode3 = (hashCode2 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        String str2 = this.prompt;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.category;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.id;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.body_text = this.body_text;
        builder.avatar = this.avatar;
        builder.prompt = this.prompt;
        builder.category = this.category;
        builder.id = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.body_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "body_text=", arrayList);
        }
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        String str2 = this.prompt;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "prompt=", arrayList);
        }
        String str3 = this.category;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "category=", arrayList);
        }
        String str4 = this.id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InChatPrompt{", "}", 0, null, null, 56);
    }
}
