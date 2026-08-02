package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Skill;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Skill$Builder;", "", "creator", "Ljava/lang/String;", "slug", "name", "category", "description", "version", "estimated_steps", "content", "", "created_at", "Ljava/lang/Long;", "updated_at", "Lcom/squareup/protos/cash/kgoose/api/v3/SlashCommand;", "slash_command", "Lcom/squareup/protos/cash/kgoose/api/v3/SlashCommand;", "", "tags", "Ljava/util/List;", "tools_required", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Skill extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Skill> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 10, tag = 11)
    public final Long created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String creator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String estimated_steps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String name;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SlashCommand#ADAPTER", schemaIndex = 12, tag = 13)
    public final SlashCommand slash_command;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String slug;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<String> tags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<String> tools_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 11, tag = 12)
    public final Long updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String version;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Skill$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Skill;", "<init>", "()V", "creator", "", "slug", "name", "category", "description", "version", "tags", "", "tools_required", "estimated_steps", "content", "created_at", "", "Ljava/lang/Long;", "updated_at", "slash_command", "Lcom/squareup/protos/cash/kgoose/api/v3/SlashCommand;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/Skill$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String category;
        public String content;
        public Long created_at;
        public String creator;
        public String description;
        public String estimated_steps;
        public String name;
        public SlashCommand slash_command;
        public String slug;
        public List<String> tags;
        public List<String> tools_required;
        public Long updated_at;
        public String version;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.tags = emptyList;
            this.tools_required = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public Skill build() {
            return new Skill(this.creator, this.slug, this.name, this.category, this.description, this.version, this.tags, this.tools_required, this.estimated_steps, this.content, this.created_at, this.updated_at, this.slash_command, buildUnknownFields());
        }

        public final Builder category(String category) {
            this.category = category;
            return this;
        }

        public final Builder content(String content) {
            this.content = content;
            return this;
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        public final Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final Builder estimated_steps(String estimated_steps) {
            this.estimated_steps = estimated_steps;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder slash_command(SlashCommand slash_command) {
            this.slash_command = slash_command;
            return this;
        }

        public final Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        public final Builder tags(List<String> tags) {
            tags.getClass();
            TransactorKt.checkElementsNotNull(tags);
            this.tags = tags;
            return this;
        }

        public final Builder tools_required(List<String> tools_required) {
            tools_required.getClass();
            TransactorKt.checkElementsNotNull(tools_required);
            this.tools_required = tools_required;
            return this;
        }

        public final Builder updated_at(Long updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public final Builder version(String version) {
            this.version = version;
            return this;
        }
    }

    static {
        Skill$Companion$ADAPTER$1 skill$Companion$ADAPTER$1 = new Skill$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Skill.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Skill", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/skills_messages.proto");
        ADAPTER = skill$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(skill$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Skill(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, String str8, Long l, Long l2, SlashCommand slashCommand, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.creator = str;
        this.slug = str2;
        this.name = str3;
        this.category = str4;
        this.description = str5;
        this.version = str6;
        this.estimated_steps = str7;
        this.content = str8;
        this.created_at = l;
        this.updated_at = l2;
        this.slash_command = slashCommand;
        this.tags = TransactorKt.immutableCopyOf("tags", list);
        this.tools_required = TransactorKt.immutableCopyOf("tools_required", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Skill)) {
            return false;
        }
        Skill skill = (Skill) obj;
        return Intrinsics.areEqual(unknownFields(), skill.unknownFields()) && Intrinsics.areEqual(this.creator, skill.creator) && Intrinsics.areEqual(this.slug, skill.slug) && Intrinsics.areEqual(this.name, skill.name) && Intrinsics.areEqual(this.category, skill.category) && Intrinsics.areEqual(this.description, skill.description) && Intrinsics.areEqual(this.version, skill.version) && Intrinsics.areEqual(this.tags, skill.tags) && Intrinsics.areEqual(this.tools_required, skill.tools_required) && Intrinsics.areEqual(this.estimated_steps, skill.estimated_steps) && Intrinsics.areEqual(this.content, skill.content) && Intrinsics.areEqual(this.created_at, skill.created_at) && Intrinsics.areEqual(this.updated_at, skill.updated_at) && Intrinsics.areEqual(this.slash_command, skill.slash_command);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.creator;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.slug;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.category;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.description;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.version;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37, 37, this.tags), 37, this.tools_required);
        String str7 = this.estimated_steps;
        int hashCode7 = (m + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.content;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode10 = (hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        SlashCommand slashCommand = this.slash_command;
        int hashCode11 = hashCode10 + (slashCommand != null ? slashCommand.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.creator = this.creator;
        builder.slug = this.slug;
        builder.name = this.name;
        builder.category = this.category;
        builder.description = this.description;
        builder.version = this.version;
        builder.tags = this.tags;
        builder.tools_required = this.tools_required;
        builder.estimated_steps = this.estimated_steps;
        builder.content = this.content;
        builder.created_at = this.created_at;
        builder.updated_at = this.updated_at;
        builder.slash_command = this.slash_command;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.creator;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "creator=", arrayList);
        }
        String str2 = this.slug;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "slug=", arrayList);
        }
        String str3 = this.name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "name=", arrayList);
        }
        String str4 = this.category;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "category=", arrayList);
        }
        String str5 = this.description;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "description=", arrayList);
        }
        String str6 = this.version;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "version=", arrayList);
        }
        if (!this.tags.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tags=", arrayList, this.tags);
        }
        if (!this.tools_required.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tools_required=", arrayList, this.tools_required);
        }
        String str7 = this.estimated_steps;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "estimated_steps=", arrayList);
        }
        String str8 = this.content;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "content=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        SlashCommand slashCommand = this.slash_command;
        if (slashCommand != null) {
            arrayList.add("slash_command=" + slashCommand);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Skill{", "}", 0, null, null, 56);
    }
}
