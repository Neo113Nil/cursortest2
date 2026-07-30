package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatBodyRequest implements Parcelable {
    public static final Parcelable.Creator<ChatBodyRequest> CREATOR = new a();
    public boolean incercept;

    @Keep
    public final String isOpenIncercept;
    public Integer max_tokens;
    public List<Msg> messages;
    public boolean online;
    public String prompt;
    public String qid;
    public Boolean stream;
    public String type;
    public String userId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final ChatBodyRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(Msg.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChatBodyRequest(readString, readString2, readString3, readString4, valueOf, valueOf2, z7, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChatBodyRequest[] newArray(int i8) {
            return new ChatBodyRequest[i8];
        }
    }

    public ChatBodyRequest() {
        this(null, null, null, null, null, null, false, null, false, 511, null);
    }

    public final String component1() {
        return this.prompt;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.qid;
    }

    public final String component4() {
        return this.userId;
    }

    public final Boolean component5() {
        return this.stream;
    }

    public final Integer component6() {
        return this.max_tokens;
    }

    public final boolean component7() {
        return this.incercept;
    }

    public final List<Msg> component8() {
        return this.messages;
    }

    public final boolean component9() {
        return this.online;
    }

    public final ChatBodyRequest copy(String prompt, String type, String qid, String userId, Boolean bool, Integer num, boolean z7, List<Msg> list, boolean z8) {
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
        return new ChatBodyRequest(prompt, type, qid, userId, bool, num, z7, list, z8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatBodyRequest)) {
            return false;
        }
        ChatBodyRequest chatBodyRequest = (ChatBodyRequest) obj;
        return s.areEqual(this.prompt, chatBodyRequest.prompt) && s.areEqual(this.type, chatBodyRequest.type) && s.areEqual(this.qid, chatBodyRequest.qid) && s.areEqual(this.userId, chatBodyRequest.userId) && s.areEqual(this.stream, chatBodyRequest.stream) && s.areEqual(this.max_tokens, chatBodyRequest.max_tokens) && this.incercept == chatBodyRequest.incercept && s.areEqual(this.messages, chatBodyRequest.messages) && this.online == chatBodyRequest.online;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.prompt.hashCode() * 31) + this.type.hashCode()) * 31) + this.qid.hashCode()) * 31) + this.userId.hashCode()) * 31;
        Boolean bool = this.stream;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.max_tokens;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z7 = this.incercept;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode3 + i8) * 31;
        List<Msg> list = this.messages;
        int hashCode4 = (i9 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z8 = this.online;
        return hashCode4 + (z8 ? 1 : z8 ? 1 : 0);
    }

    public String toString() {
        return "ChatBodyRequest(prompt=" + this.prompt + ", type=" + this.type + ", qid=" + this.qid + ", userId=" + this.userId + ", stream=" + this.stream + ", max_tokens=" + this.max_tokens + ", incercept=" + this.incercept + ", messages=" + this.messages + ", online=" + this.online + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.prompt);
        out.writeString(this.type);
        out.writeString(this.qid);
        out.writeString(this.userId);
        Boolean bool = this.stream;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.max_tokens;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeInt(this.incercept ? 1 : 0);
        List<Msg> list = this.messages;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator<Msg> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i8);
            }
        }
        out.writeInt(this.online ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt) {
        this(prompt, null, null, null, null, null, false, null, false, 510, null);
        s.checkNotNullParameter(prompt, "prompt");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type) {
        this(prompt, type, null, null, null, null, false, null, false, 508, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type, String qid) {
        this(prompt, type, qid, null, null, null, false, null, false, 504, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type, String qid, String userId) {
        this(prompt, type, qid, userId, null, null, false, null, false, 496, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type, String qid, String userId, Boolean bool) {
        this(prompt, type, qid, userId, bool, null, false, null, false, 480, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type, String qid, String userId, Boolean bool, Integer num) {
        this(prompt, type, qid, userId, bool, num, false, null, false, 448, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type, String qid, String userId, Boolean bool, Integer num, boolean z7) {
        this(prompt, type, qid, userId, bool, num, z7, null, false, RendererCapabilities.MODE_SUPPORT_MASK, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBodyRequest(String prompt, String type, String qid, String userId, Boolean bool, Integer num, boolean z7, List<Msg> list) {
        this(prompt, type, qid, userId, bool, num, z7, list, false, 256, null);
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
    }

    public ChatBodyRequest(String prompt, String type, String qid, String userId, Boolean bool, Integer num, boolean z7, List<Msg> list, boolean z8) {
        s.checkNotNullParameter(prompt, "prompt");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(userId, "userId");
        this.prompt = prompt;
        this.type = type;
        this.qid = qid;
        this.userId = userId;
        this.stream = bool;
        this.max_tokens = num;
        this.incercept = z7;
        this.messages = list;
        this.online = z8;
        this.isOpenIncercept = z7 ? null : "close";
    }

    public /* synthetic */ ChatBodyRequest(String str, String str2, String str3, String str4, Boolean bool, Integer num, boolean z7, List list, boolean z8, int i8, o oVar) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? str4 : "", (i8 & 16) != 0 ? Boolean.TRUE : bool, (i8 & 32) != 0 ? 200 : num, (i8 & 64) != 0 ? false : z7, (i8 & 128) != 0 ? null : list, (i8 & 256) == 0 ? z8 : false);
    }
}
