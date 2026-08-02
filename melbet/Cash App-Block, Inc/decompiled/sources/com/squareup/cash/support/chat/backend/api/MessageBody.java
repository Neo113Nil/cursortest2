package com.squareup.cash.support.chat.backend.api;

import androidx.glance.layout.SpacerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.UriString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class MessageBody {

    public final class ActionBody extends MessageBody {
        public final SpacerKt action;
        public final String subtitle;
        public final String title;

        public ActionBody(String str, String str2, SpacerKt spacerKt) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.action = spacerKt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBody)) {
                return false;
            }
            ActionBody actionBody = (ActionBody) obj;
            return Intrinsics.areEqual(this.title, actionBody.title) && Intrinsics.areEqual(this.subtitle, actionBody.subtitle) && this.action.equals(actionBody.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionBody(title=", this.title, ", subtitle=", this.subtitle, ", action=");
            m.append(this.action);
            m.append(")");
            return m.toString();
        }
    }

    public final class ActivityItemTransactionBody extends MessageBody {
        public final String entityId;

        public ActivityItemTransactionBody(String str) {
            str.getClass();
            this.entityId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityItemTransactionBody) && Intrinsics.areEqual(this.entityId, ((ActivityItemTransactionBody) obj).entityId);
        }

        public final String getEntityId() {
            return this.entityId;
        }

        public final int hashCode() {
            return this.entityId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityItemTransactionBody(entityId=", this.entityId, ")");
        }
    }

    public final class SelectedReplyBody extends MessageBody {
        public final SuggestedReply reply;

        public SelectedReplyBody(SuggestedReply suggestedReply) {
            this.reply = suggestedReply;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedReplyBody) && this.reply.equals(((SelectedReplyBody) obj).reply);
        }

        public final SuggestedReply getReply() {
            return this.reply;
        }

        public final int hashCode() {
            return this.reply.hashCode();
        }

        public final String toString() {
            return "SelectedReplyBody(reply=" + this.reply + ")";
        }
    }

    public final class SystemMessageBody extends MessageBody {
        public final Styling styling;
        public final String text;

        public final class Styling {
            public final Boolean showDivider;
            public final Boolean showTimestamp;

            public Styling(Boolean bool, Boolean bool2) {
                this.showDivider = bool;
                this.showTimestamp = bool2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Styling)) {
                    return false;
                }
                Styling styling = (Styling) obj;
                return Intrinsics.areEqual(this.showDivider, styling.showDivider) && Intrinsics.areEqual(this.showTimestamp, styling.showTimestamp);
            }

            public final int hashCode() {
                Boolean bool = this.showDivider;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.showTimestamp;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public final String toString() {
                return "Styling(showDivider=" + this.showDivider + ", showTimestamp=" + this.showTimestamp + ")";
            }
        }

        public SystemMessageBody(String str, Styling styling) {
            str.getClass();
            this.text = str;
            this.styling = styling;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SystemMessageBody)) {
                return false;
            }
            SystemMessageBody systemMessageBody = (SystemMessageBody) obj;
            return Intrinsics.areEqual(this.text, systemMessageBody.text) && Intrinsics.areEqual(this.styling, systemMessageBody.styling);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Styling styling = this.styling;
            return hashCode + (styling == null ? 0 : styling.hashCode());
        }

        public final String toString() {
            return "SystemMessageBody(text=" + this.text + ", styling=" + this.styling + ")";
        }
    }

    public final class TextBody extends MessageBody {
        public final String text;

        public TextBody(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextBody) && Intrinsics.areEqual(this.text, ((TextBody) obj).text);
        }

        public final String getText() {
            return this.text;
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextBody(text=", this.text, ")");
        }
    }

    public abstract class TransactionBody extends MessageBody {

        public final class AvatarComponents {
            public final boolean colorizeAvatar;
            public final String darkSrgb;
            public final String darkUrl;
            public final String displayName;
            public final String email;
            public final boolean fillBackground;
            public final String lightSrgb;
            public final String lightUrl;
            public final String lookupKey;
            public final String sms;

            public AvatarComponents(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8) {
                this.lightUrl = str;
                this.darkUrl = str2;
                this.lightSrgb = str3;
                this.darkSrgb = str4;
                this.displayName = str5;
                this.colorizeAvatar = z;
                this.fillBackground = z2;
                this.lookupKey = str6;
                this.email = str7;
                this.sms = str8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AvatarComponents)) {
                    return false;
                }
                AvatarComponents avatarComponents = (AvatarComponents) obj;
                return Intrinsics.areEqual(this.lightUrl, avatarComponents.lightUrl) && Intrinsics.areEqual(this.darkUrl, avatarComponents.darkUrl) && Intrinsics.areEqual(this.lightSrgb, avatarComponents.lightSrgb) && Intrinsics.areEqual(this.darkSrgb, avatarComponents.darkSrgb) && Intrinsics.areEqual(this.displayName, avatarComponents.displayName) && this.colorizeAvatar == avatarComponents.colorizeAvatar && this.fillBackground == avatarComponents.fillBackground && Intrinsics.areEqual(this.lookupKey, avatarComponents.lookupKey) && Intrinsics.areEqual(this.email, avatarComponents.email) && Intrinsics.areEqual(this.sms, avatarComponents.sms);
            }

            public final int hashCode() {
                String str = this.lightUrl;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.darkUrl;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.lightSrgb;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.darkSrgb;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.displayName;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.colorizeAvatar), 31, this.fillBackground);
                String str6 = this.lookupKey;
                int hashCode5 = (m + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.email;
                int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.sms;
                return hashCode6 + (str8 != null ? str8.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarComponents(lightUrl=", this.lightUrl, ", darkUrl=", this.darkUrl, ", lightSrgb=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.lightSrgb, ", darkSrgb=", this.darkSrgb, ", displayName=");
                NavAction$$ExternalSyntheticOutline0.m(m, this.displayName, ", colorizeAvatar=", this.colorizeAvatar, ", fillBackground=");
                NavAction$$ExternalSyntheticOutline0.m(m, this.fillBackground, ", lookupKey=", this.lookupKey, ", email=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.email, ", sms=", this.sms, ")");
            }
        }

        public final class Loaded extends TransactionBody {
            public final AvatarComponents avatarComponents;
            public final String entityId;
            public final String title;

            public Loaded(String str, String str2, AvatarComponents avatarComponents) {
                str.getClass();
                this.entityId = str;
                this.title = str2;
                this.avatarComponents = avatarComponents;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return Intrinsics.areEqual(this.entityId, loaded.entityId) && Intrinsics.areEqual(this.title, loaded.title) && this.avatarComponents.equals(loaded.avatarComponents);
            }

            @Override // com.squareup.cash.support.chat.backend.api.MessageBody.TransactionBody
            public final String getEntityId() {
                return this.entityId;
            }

            public final int hashCode() {
                int hashCode = this.entityId.hashCode() * 31;
                String str = this.title;
                return this.avatarComponents.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(entityId=", this.entityId, ", title=", this.title, ", avatarComponents=");
                m.append(this.avatarComponents);
                m.append(")");
                return m.toString();
            }
        }

        public final class Missing extends TransactionBody {
            public final String entityId;

            public Missing(String str) {
                str.getClass();
                this.entityId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Missing) && Intrinsics.areEqual(this.entityId, ((Missing) obj).entityId);
            }

            @Override // com.squareup.cash.support.chat.backend.api.MessageBody.TransactionBody
            public final String getEntityId() {
                return this.entityId;
            }

            public final int hashCode() {
                return this.entityId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Missing(entityId=", this.entityId, ")");
            }
        }

        public final class Selected extends TransactionBody {
            public final String entityId;

            public Selected(String str) {
                this.entityId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Selected) && this.entityId.equals(((Selected) obj).entityId);
            }

            @Override // com.squareup.cash.support.chat.backend.api.MessageBody.TransactionBody
            public final String getEntityId() {
                return this.entityId;
            }

            public final int hashCode() {
                return this.entityId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selected(entityId=", this.entityId, ")");
            }
        }

        public abstract String getEntityId();
    }

    public final class UnknownBody extends MessageBody {
        public static final UnknownBody INSTANCE = new UnknownBody();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnknownBody);
        }

        public final int hashCode() {
            return -1662585196;
        }

        public final String toString() {
            return "UnknownBody";
        }
    }

    public final class FileBody extends MessageBody {
        public final String fileToken;
        public final FileMetadata metadata;
        public final String uri;

        public FileBody(FileMetadata fileMetadata, String str, String str2) {
            str.getClass();
            fileMetadata.getClass();
            this.uri = str;
            this.metadata = fileMetadata;
            this.fileToken = str2;
        }

        /* renamed from: copy-5y75sic$default, reason: not valid java name */
        public static FileBody m3748copy5y75sic$default(FileBody fileBody, String str) {
            String str2 = fileBody.uri;
            FileMetadata fileMetadata = fileBody.metadata;
            fileBody.getClass();
            str2.getClass();
            fileMetadata.getClass();
            return new FileBody(fileMetadata, str2, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileBody)) {
                return false;
            }
            FileBody fileBody = (FileBody) obj;
            return Intrinsics.areEqual(this.uri, fileBody.uri) && Intrinsics.areEqual(this.metadata, fileBody.metadata) && Intrinsics.areEqual(this.fileToken, fileBody.fileToken);
        }

        public final String getFileToken() {
            return this.fileToken;
        }

        public final FileMetadata getMetadata() {
            return this.metadata;
        }

        /* renamed from: getUri-1zWY0OA, reason: not valid java name */
        public final String m3749getUri1zWY0OA() {
            return this.uri;
        }

        public final int hashCode() {
            int hashCode = (this.metadata.hashCode() + (this.uri.hashCode() * 31)) * 31;
            String str = this.fileToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            String m3554toStringimpl = UriString.m3554toStringimpl(this.uri);
            StringBuilder sb = new StringBuilder("FileBody(uri=");
            sb.append(m3554toStringimpl);
            sb.append(", metadata=");
            sb.append(this.metadata);
            sb.append(", fileToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.fileToken, ")");
        }

        public /* synthetic */ FileBody(String str, FileMetadata fileMetadata) {
            this(fileMetadata, str, null);
        }
    }
}
