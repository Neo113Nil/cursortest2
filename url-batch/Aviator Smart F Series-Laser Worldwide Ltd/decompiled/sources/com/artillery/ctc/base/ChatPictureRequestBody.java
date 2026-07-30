package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.hutool.core.util.i0;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatPictureRequestBody implements Parcelable {
    public static final Parcelable.Creator<ChatPictureRequestBody> CREATOR = new a();
    public ChatOverseasPictureParams overseas;
    public ChatPictureParams params;
    public String tid;
    public String token;
    public String userId;

    @Keep
    public static final class ChatOverseasPictureParams implements Parcelable {
        public static final Parcelable.Creator<ChatOverseasPictureParams> CREATOR = new a();
        public Integer change_degree;
        public Integer height;
        public String image;
        public Integer image_num;
        public String language;
        public Integer oversea;
        public String pdf_file;
        public String pdf_file_num;
        public String prompt;
        public Integer resizeHeight;
        public Integer resizeWidth;
        public String style;
        public String url;
        public Integer width;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final ChatOverseasPictureParams createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new ChatOverseasPictureParams(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final ChatOverseasPictureParams[] newArray(int i8) {
                return new ChatOverseasPictureParams[i8];
            }
        }

        public ChatOverseasPictureParams() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        public final String component1() {
            return this.prompt;
        }

        public final String component10() {
            return this.pdf_file;
        }

        public final String component11() {
            return this.pdf_file_num;
        }

        public final Integer component12() {
            return this.change_degree;
        }

        public final String component13() {
            return this.language;
        }

        public final Integer component14() {
            return this.oversea;
        }

        public final Integer component2() {
            return this.resizeWidth;
        }

        public final Integer component3() {
            return this.resizeHeight;
        }

        public final Integer component4() {
            return this.width;
        }

        public final Integer component5() {
            return this.height;
        }

        public final Integer component6() {
            return this.image_num;
        }

        public final String component7() {
            return this.image;
        }

        public final String component8() {
            return this.style;
        }

        public final String component9() {
            return this.url;
        }

        public final ChatOverseasPictureParams copy(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, Integer num6, String str6, Integer num7) {
            s.checkNotNullParameter(prompt, "prompt");
            return new ChatOverseasPictureParams(prompt, num, num2, num3, num4, num5, str, str2, str3, str4, str5, num6, str6, num7);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatOverseasPictureParams)) {
                return false;
            }
            ChatOverseasPictureParams chatOverseasPictureParams = (ChatOverseasPictureParams) obj;
            return s.areEqual(this.prompt, chatOverseasPictureParams.prompt) && s.areEqual(this.resizeWidth, chatOverseasPictureParams.resizeWidth) && s.areEqual(this.resizeHeight, chatOverseasPictureParams.resizeHeight) && s.areEqual(this.width, chatOverseasPictureParams.width) && s.areEqual(this.height, chatOverseasPictureParams.height) && s.areEqual(this.image_num, chatOverseasPictureParams.image_num) && s.areEqual(this.image, chatOverseasPictureParams.image) && s.areEqual(this.style, chatOverseasPictureParams.style) && s.areEqual(this.url, chatOverseasPictureParams.url) && s.areEqual(this.pdf_file, chatOverseasPictureParams.pdf_file) && s.areEqual(this.pdf_file_num, chatOverseasPictureParams.pdf_file_num) && s.areEqual(this.change_degree, chatOverseasPictureParams.change_degree) && s.areEqual(this.language, chatOverseasPictureParams.language) && s.areEqual(this.oversea, chatOverseasPictureParams.oversea);
        }

        public int hashCode() {
            int hashCode = this.prompt.hashCode() * 31;
            Integer num = this.resizeWidth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.resizeHeight;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.width;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.height;
            int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.image_num;
            int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str = this.image;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.style;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.pdf_file;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pdf_file_num;
            int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num6 = this.change_degree;
            int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str6 = this.language;
            int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num7 = this.oversea;
            return hashCode13 + (num7 != null ? num7.hashCode() : 0);
        }

        public String toString() {
            return "ChatOverseasPictureParams(prompt=" + this.prompt + ", resizeWidth=" + this.resizeWidth + ", resizeHeight=" + this.resizeHeight + ", width=" + this.width + ", height=" + this.height + ", image_num=" + this.image_num + ", image=" + this.image + ", style=" + this.style + ", url=" + this.url + ", pdf_file=" + this.pdf_file + ", pdf_file_num=" + this.pdf_file_num + ", change_degree=" + this.change_degree + ", language=" + this.language + ", oversea=" + this.oversea + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.prompt);
            Integer num = this.resizeWidth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.resizeHeight;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            Integer num3 = this.width;
            if (num3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num3.intValue());
            }
            Integer num4 = this.height;
            if (num4 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num4.intValue());
            }
            Integer num5 = this.image_num;
            if (num5 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num5.intValue());
            }
            out.writeString(this.image);
            out.writeString(this.style);
            out.writeString(this.url);
            out.writeString(this.pdf_file);
            out.writeString(this.pdf_file_num);
            Integer num6 = this.change_degree;
            if (num6 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num6.intValue());
            }
            out.writeString(this.language);
            Integer num7 = this.oversea;
            if (num7 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num7.intValue());
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt) {
            this(prompt, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num) {
            this(prompt, num, null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2) {
            this(prompt, num, num2, null, null, null, null, null, null, null, null, null, null, null, 16376, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3) {
            this(prompt, num, num2, num3, null, null, null, null, null, null, null, null, null, null, 16368, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4) {
            this(prompt, num, num2, num3, num4, null, null, null, null, null, null, null, null, null, 16352, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            this(prompt, num, num2, num3, num4, num5, null, null, null, null, null, null, null, null, 16320, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str) {
            this(prompt, num, num2, num3, num4, num5, str, null, null, null, null, null, null, null, 16256, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
            this(prompt, num, num2, num3, num4, num5, str, str2, null, null, null, null, null, null, 16128, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3) {
            this(prompt, num, num2, num3, num4, num5, str, str2, str3, null, null, null, null, null, 15872, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4) {
            this(prompt, num, num2, num3, num4, num5, str, str2, str3, str4, null, null, null, null, 15360, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5) {
            this(prompt, num, num2, num3, num4, num5, str, str2, str3, str4, str5, null, null, null, 14336, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, Integer num6) {
            this(prompt, num, num2, num3, num4, num5, str, str2, str3, str4, str5, num6, null, null, 12288, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, Integer num6, String str6) {
            this(prompt, num, num2, num3, num4, num5, str, str2, str3, str4, str5, num6, str6, null, 8192, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        public ChatOverseasPictureParams(String prompt, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, Integer num6, String str6, Integer num7) {
            s.checkNotNullParameter(prompt, "prompt");
            this.prompt = prompt;
            this.resizeWidth = num;
            this.resizeHeight = num2;
            this.width = num3;
            this.height = num4;
            this.image_num = num5;
            this.image = str;
            this.style = str2;
            this.url = str3;
            this.pdf_file = str4;
            this.pdf_file_num = str5;
            this.change_degree = num6;
            this.language = str6;
            this.oversea = num7;
        }

        public /* synthetic */ ChatOverseasPictureParams(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, String str3, String str4, String str5, String str6, Integer num6, String str7, Integer num7, int i8, o oVar) {
            this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? null : num2, (i8 & 8) != 0 ? null : num3, (i8 & 16) != 0 ? null : num4, (i8 & 32) != 0 ? null : num5, (i8 & 64) != 0 ? null : str2, (i8 & 128) != 0 ? null : str3, (i8 & 256) != 0 ? null : str4, (i8 & 512) != 0 ? null : str5, (i8 & 1024) != 0 ? null : str6, (i8 & 2048) != 0 ? null : num6, (i8 & 4096) != 0 ? null : str7, (i8 & 8192) == 0 ? num7 : null);
        }
    }

    @Keep
    public static final class ChatPictureParams implements Parcelable {
        public static final Parcelable.Creator<ChatPictureParams> CREATOR = new a();
        public int batchSize;
        public int height;
        public String query;
        public String style;
        public String tag;
        public int width;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final ChatPictureParams createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new ChatPictureParams(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChatPictureParams[] newArray(int i8) {
                return new ChatPictureParams[i8];
            }
        }

        public ChatPictureParams() {
            this(null, null, 0, 0, 0, null, 63, null);
        }

        public static /* synthetic */ ChatPictureParams copy$default(ChatPictureParams chatPictureParams, String str, String str2, int i8, int i9, int i10, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = chatPictureParams.query;
            }
            if ((i11 & 2) != 0) {
                str2 = chatPictureParams.style;
            }
            String str4 = str2;
            if ((i11 & 4) != 0) {
                i8 = chatPictureParams.width;
            }
            int i12 = i8;
            if ((i11 & 8) != 0) {
                i9 = chatPictureParams.height;
            }
            int i13 = i9;
            if ((i11 & 16) != 0) {
                i10 = chatPictureParams.batchSize;
            }
            int i14 = i10;
            if ((i11 & 32) != 0) {
                str3 = chatPictureParams.tag;
            }
            return chatPictureParams.copy(str, str4, i12, i13, i14, str3);
        }

        public final String component1() {
            return this.query;
        }

        public final String component2() {
            return this.style;
        }

        public final int component3() {
            return this.width;
        }

        public final int component4() {
            return this.height;
        }

        public final int component5() {
            return this.batchSize;
        }

        public final String component6() {
            return this.tag;
        }

        public final ChatPictureParams copy(String query, String style, int i8, int i9, int i10, String str) {
            s.checkNotNullParameter(query, "query");
            s.checkNotNullParameter(style, "style");
            return new ChatPictureParams(query, style, i8, i9, i10, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatPictureParams)) {
                return false;
            }
            ChatPictureParams chatPictureParams = (ChatPictureParams) obj;
            return s.areEqual(this.query, chatPictureParams.query) && s.areEqual(this.style, chatPictureParams.style) && this.width == chatPictureParams.width && this.height == chatPictureParams.height && this.batchSize == chatPictureParams.batchSize && s.areEqual(this.tag, chatPictureParams.tag);
        }

        public int hashCode() {
            int hashCode = ((((((((this.query.hashCode() * 31) + this.style.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.batchSize) * 31;
            String str = this.tag;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ChatPictureParams(query=" + this.query + ", style=" + this.style + ", width=" + this.width + ", height=" + this.height + ", batchSize=" + this.batchSize + ", tag=" + this.tag + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.query);
            out.writeString(this.style);
            out.writeInt(this.width);
            out.writeInt(this.height);
            out.writeInt(this.batchSize);
            out.writeString(this.tag);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatPictureParams(String query) {
            this(query, null, 0, 0, 0, null, 62, null);
            s.checkNotNullParameter(query, "query");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatPictureParams(String query, String style) {
            this(query, style, 0, 0, 0, null, 60, null);
            s.checkNotNullParameter(query, "query");
            s.checkNotNullParameter(style, "style");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatPictureParams(String query, String style, int i8) {
            this(query, style, i8, 0, 0, null, 56, null);
            s.checkNotNullParameter(query, "query");
            s.checkNotNullParameter(style, "style");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatPictureParams(String query, String style, int i8, int i9) {
            this(query, style, i8, i9, 0, null, 48, null);
            s.checkNotNullParameter(query, "query");
            s.checkNotNullParameter(style, "style");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChatPictureParams(String query, String style, int i8, int i9, int i10) {
            this(query, style, i8, i9, i10, null, 32, null);
            s.checkNotNullParameter(query, "query");
            s.checkNotNullParameter(style, "style");
        }

        public ChatPictureParams(String query, String style, int i8, int i9, int i10, String str) {
            s.checkNotNullParameter(query, "query");
            s.checkNotNullParameter(style, "style");
            this.query = query;
            this.style = style;
            this.width = i8;
            this.height = i9;
            this.batchSize = i10;
            this.tag = str;
        }

        public /* synthetic */ ChatPictureParams(String str, String str2, int i8, int i9, int i10, String str3, int i11, o oVar) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG : str2, (i11 & 4) != 0 ? 512 : i8, (i11 & 8) == 0 ? i9 : 512, (i11 & 16) != 0 ? 1 : i10, (i11 & 32) != 0 ? null : str3);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final ChatPictureRequestBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new ChatPictureRequestBody(parcel.readInt() == 0 ? null : ChatOverseasPictureParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ChatPictureParams.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChatPictureRequestBody[] newArray(int i8) {
            return new ChatPictureRequestBody[i8];
        }
    }

    public ChatPictureRequestBody() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ChatPictureRequestBody copy$default(ChatPictureRequestBody chatPictureRequestBody, ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            chatOverseasPictureParams = chatPictureRequestBody.overseas;
        }
        if ((i8 & 2) != 0) {
            chatPictureParams = chatPictureRequestBody.params;
        }
        ChatPictureParams chatPictureParams2 = chatPictureParams;
        if ((i8 & 4) != 0) {
            str = chatPictureRequestBody.userId;
        }
        String str4 = str;
        if ((i8 & 8) != 0) {
            str2 = chatPictureRequestBody.token;
        }
        String str5 = str2;
        if ((i8 & 16) != 0) {
            str3 = chatPictureRequestBody.tid;
        }
        return chatPictureRequestBody.copy(chatOverseasPictureParams, chatPictureParams2, str4, str5, str3);
    }

    public final ChatOverseasPictureParams component1() {
        return this.overseas;
    }

    public final ChatPictureParams component2() {
        return this.params;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.token;
    }

    public final String component5() {
        return this.tid;
    }

    public final ChatPictureRequestBody copy(ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams, String userId, String token, String tid) {
        s.checkNotNullParameter(userId, "userId");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(tid, "tid");
        return new ChatPictureRequestBody(chatOverseasPictureParams, chatPictureParams, userId, token, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatPictureRequestBody)) {
            return false;
        }
        ChatPictureRequestBody chatPictureRequestBody = (ChatPictureRequestBody) obj;
        return s.areEqual(this.overseas, chatPictureRequestBody.overseas) && s.areEqual(this.params, chatPictureRequestBody.params) && s.areEqual(this.userId, chatPictureRequestBody.userId) && s.areEqual(this.token, chatPictureRequestBody.token) && s.areEqual(this.tid, chatPictureRequestBody.tid);
    }

    public int hashCode() {
        ChatOverseasPictureParams chatOverseasPictureParams = this.overseas;
        int hashCode = (chatOverseasPictureParams == null ? 0 : chatOverseasPictureParams.hashCode()) * 31;
        ChatPictureParams chatPictureParams = this.params;
        return ((((((hashCode + (chatPictureParams != null ? chatPictureParams.hashCode() : 0)) * 31) + this.userId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "ChatPictureRequestBody(overseas=" + this.overseas + ", params=" + this.params + ", userId=" + this.userId + ", token=" + this.token + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        ChatOverseasPictureParams chatOverseasPictureParams = this.overseas;
        if (chatOverseasPictureParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            chatOverseasPictureParams.writeToParcel(out, i8);
        }
        ChatPictureParams chatPictureParams = this.params;
        if (chatPictureParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            chatPictureParams.writeToParcel(out, i8);
        }
        out.writeString(this.userId);
        out.writeString(this.token);
        out.writeString(this.tid);
    }

    public ChatPictureRequestBody(ChatOverseasPictureParams chatOverseasPictureParams) {
        this(chatOverseasPictureParams, null, null, null, null, 30, null);
    }

    public ChatPictureRequestBody(ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams) {
        this(chatOverseasPictureParams, chatPictureParams, null, null, null, 28, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatPictureRequestBody(ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams, String userId) {
        this(chatOverseasPictureParams, chatPictureParams, userId, null, null, 24, null);
        s.checkNotNullParameter(userId, "userId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatPictureRequestBody(ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams, String userId, String token) {
        this(chatOverseasPictureParams, chatPictureParams, userId, token, null, 16, null);
        s.checkNotNullParameter(userId, "userId");
        s.checkNotNullParameter(token, "token");
    }

    public ChatPictureRequestBody(ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams, String userId, String token, String tid) {
        s.checkNotNullParameter(userId, "userId");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(tid, "tid");
        this.overseas = chatOverseasPictureParams;
        this.params = chatPictureParams;
        this.userId = userId;
        this.token = token;
        this.tid = tid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChatPictureRequestBody(ChatOverseasPictureParams chatOverseasPictureParams, ChatPictureParams chatPictureParams, String str, String str2, String str3, int i8, o oVar) {
        this(r10, r0, r1, str2, (i8 & 16) != 0 ? "" : str3);
        ChatOverseasPictureParams chatOverseasPictureParams2 = (i8 & 1) != 0 ? null : chatOverseasPictureParams;
        ChatPictureParams chatPictureParams2 = (i8 & 2) == 0 ? chatPictureParams : null;
        if ((i8 & 4) != 0) {
            str = i0.randomString("abcdefghijklmnopqrstuvwxyz", 5);
            s.checkNotNullExpressionValue(str, "randomString(RandomUtil.BASE_CHAR, 5)");
        }
        String str4 = str;
        if ((i8 & 8) != 0) {
            str2 = i0.randomString("abcdefghijklmnopqrstuvwxyz", 16);
            s.checkNotNullExpressionValue(str2, "randomString(RandomUtil.BASE_CHAR, 16)");
        }
    }
}
