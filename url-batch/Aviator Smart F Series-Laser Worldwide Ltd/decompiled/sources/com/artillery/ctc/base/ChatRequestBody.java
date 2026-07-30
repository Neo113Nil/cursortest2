package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.artillery.ctc.uitls.DeviceUtils;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatRequestBody implements Parcelable {
    public static final Parcelable.Creator<ChatRequestBody> CREATOR = new a();
    public Data data;
    public DcsData dcs_data;
    public Integer mode;
    public Oversea oversea;
    public String pid;
    public String qid;
    private final String tid;
    public String userId;

    @Keep
    public static final class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new a();
        public int max_tokens;
        public List<Messages> messages;
        public String prompt;
        public boolean stream;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                boolean z7 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i8 = 0; i8 != readInt2; i8++) {
                    arrayList.add(Messages.CREATOR.createFromParcel(parcel));
                }
                return new Data(readString, z7, readInt, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i8) {
                return new Data[i8];
            }
        }

        public Data() {
            this(null, false, 0, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, String str, boolean z7, int i8, List list, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = data.prompt;
            }
            if ((i9 & 2) != 0) {
                z7 = data.stream;
            }
            if ((i9 & 4) != 0) {
                i8 = data.max_tokens;
            }
            if ((i9 & 8) != 0) {
                list = data.messages;
            }
            return data.copy(str, z7, i8, list);
        }

        public final String component1() {
            return this.prompt;
        }

        public final boolean component2() {
            return this.stream;
        }

        public final int component3() {
            return this.max_tokens;
        }

        public final List<Messages> component4() {
            return this.messages;
        }

        public final Data copy(String prompt, boolean z7, int i8, List<Messages> messages) {
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(messages, "messages");
            return new Data(prompt, z7, i8, messages);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return s.areEqual(this.prompt, data.prompt) && this.stream == data.stream && this.max_tokens == data.max_tokens && s.areEqual(this.messages, data.messages);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.prompt.hashCode() * 31;
            boolean z7 = this.stream;
            int i8 = z7;
            if (z7 != 0) {
                i8 = 1;
            }
            return ((((hashCode + i8) * 31) + this.max_tokens) * 31) + this.messages.hashCode();
        }

        public String toString() {
            return "Data(prompt=" + this.prompt + ", stream=" + this.stream + ", max_tokens=" + this.max_tokens + ", messages=" + this.messages + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.prompt);
            out.writeInt(this.stream ? 1 : 0);
            out.writeInt(this.max_tokens);
            List<Messages> list = this.messages;
            out.writeInt(list.size());
            Iterator<Messages> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i8);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Data(String prompt) {
            this(prompt, false, 0, null, 14, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Data(String prompt, boolean z7) {
            this(prompt, z7, 0, null, 12, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Data(String prompt, boolean z7, int i8) {
            this(prompt, z7, i8, null, 8, null);
            s.checkNotNullParameter(prompt, "prompt");
        }

        public Data(String prompt, boolean z7, int i8, List<Messages> messages) {
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(messages, "messages");
            this.prompt = prompt;
            this.stream = z7;
            this.max_tokens = i8;
            this.messages = messages;
        }

        public /* synthetic */ Data(String str, boolean z7, int i8, List list, int i9, o oVar) {
            this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? true : z7, (i9 & 4) != 0 ? 200 : i8, (i9 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        }
    }

    @Keep
    public static final class DcsData implements Parcelable {
        public static final Parcelable.Creator<DcsData> CREATOR = new a();
        public String didp;
        public String events;
        public String sn;
        public String text;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final DcsData createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new DcsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DcsData[] newArray(int i8) {
                return new DcsData[i8];
            }
        }

        public DcsData() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ DcsData copy$default(DcsData dcsData, String str, String str2, String str3, String str4, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = dcsData.text;
            }
            if ((i8 & 2) != 0) {
                str2 = dcsData.didp;
            }
            if ((i8 & 4) != 0) {
                str3 = dcsData.events;
            }
            if ((i8 & 8) != 0) {
                str4 = dcsData.sn;
            }
            return dcsData.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.didp;
        }

        public final String component3() {
            return this.events;
        }

        public final String component4() {
            return this.sn;
        }

        public final DcsData copy(String str, String str2, String events, String sn) {
            s.checkNotNullParameter(events, "events");
            s.checkNotNullParameter(sn, "sn");
            return new DcsData(str, str2, events, sn);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DcsData)) {
                return false;
            }
            DcsData dcsData = (DcsData) obj;
            return s.areEqual(this.text, dcsData.text) && s.areEqual(this.didp, dcsData.didp) && s.areEqual(this.events, dcsData.events) && s.areEqual(this.sn, dcsData.sn);
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.didp;
            return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.events.hashCode()) * 31) + this.sn.hashCode();
        }

        public String toString() {
            return "DcsData(text=" + this.text + ", didp=" + this.didp + ", events=" + this.events + ", sn=" + this.sn + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.text);
            out.writeString(this.didp);
            out.writeString(this.events);
            out.writeString(this.sn);
        }

        public DcsData(String str) {
            this(str, null, null, null, 14, null);
        }

        public DcsData(String str, String str2) {
            this(str, str2, null, null, 12, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DcsData(String str, String str2, String events) {
            this(str, str2, events, null, 8, null);
            s.checkNotNullParameter(events, "events");
        }

        public DcsData(String str, String str2, String events, String sn) {
            s.checkNotNullParameter(events, "events");
            s.checkNotNullParameter(sn, "sn");
            this.text = str;
            this.didp = str2;
            this.events = events;
            this.sn = sn;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ DcsData(String str, String str2, String str3, String str4, int i8, o oVar) {
            this(str, str2, str3, str4);
            str = (i8 & 1) != 0 ? null : str;
            str2 = (i8 & 2) != 0 ? null : str2;
            str3 = (i8 & 4) != 0 ? "" : str3;
            if ((i8 & 8) != 0) {
                str4 = DeviceUtils.getUniqueDeviceId();
                s.checkNotNullExpressionValue(str4, "getUniqueDeviceId()");
            }
        }
    }

    @Keep
    public static final class Messages implements Parcelable {
        public static final Parcelable.Creator<Messages> CREATOR = new a();
        public String content;
        public String role;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Messages createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new Messages(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Messages[] newArray(int i8) {
                return new Messages[i8];
            }
        }

        public Messages(String role, String content) {
            s.checkNotNullParameter(role, "role");
            s.checkNotNullParameter(content, "content");
            this.role = role;
            this.content = content;
        }

        public static /* synthetic */ Messages copy$default(Messages messages, String str, String str2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = messages.role;
            }
            if ((i8 & 2) != 0) {
                str2 = messages.content;
            }
            return messages.copy(str, str2);
        }

        public final String component1() {
            return this.role;
        }

        public final String component2() {
            return this.content;
        }

        public final Messages copy(String role, String content) {
            s.checkNotNullParameter(role, "role");
            s.checkNotNullParameter(content, "content");
            return new Messages(role, content);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) obj;
            return s.areEqual(this.role, messages.role) && s.areEqual(this.content, messages.content);
        }

        public int hashCode() {
            return (this.role.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Messages(role=" + this.role + ", content=" + this.content + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.role);
            out.writeString(this.content);
        }
    }

    @Keep
    public static final class Oversea implements Parcelable {
        public static final Parcelable.Creator<Oversea> CREATOR = new a();
        public Boolean enableContext;
        public Boolean enableSearch;
        public String language;
        public Integer max_tokens;
        public List<Messages> messages;
        public String prompt;
        public String qid;
        public Boolean stream;
        public String userId;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Oversea createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                s.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList.add(Messages.CREATOR.createFromParcel(parcel));
                    }
                }
                return new Oversea(readString, readString2, readString3, valueOf, valueOf2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            }

            @Override // android.os.Parcelable.Creator
            public final Oversea[] newArray(int i8) {
                return new Oversea[i8];
            }
        }

        public Oversea() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public final String component1() {
            return this.qid;
        }

        public final String component2() {
            return this.prompt;
        }

        public final String component3() {
            return this.userId;
        }

        public final Boolean component4() {
            return this.stream;
        }

        public final Integer component5() {
            return this.max_tokens;
        }

        public final List<Messages> component6() {
            return this.messages;
        }

        public final String component7() {
            return this.language;
        }

        public final Boolean component8() {
            return this.enableContext;
        }

        public final Boolean component9() {
            return this.enableSearch;
        }

        public final Oversea copy(String qid, String prompt, String userId, Boolean bool, Integer num, List<Messages> list, String str, Boolean bool2, Boolean bool3) {
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
            return new Oversea(qid, prompt, userId, bool, num, list, str, bool2, bool3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Oversea)) {
                return false;
            }
            Oversea oversea = (Oversea) obj;
            return s.areEqual(this.qid, oversea.qid) && s.areEqual(this.prompt, oversea.prompt) && s.areEqual(this.userId, oversea.userId) && s.areEqual(this.stream, oversea.stream) && s.areEqual(this.max_tokens, oversea.max_tokens) && s.areEqual(this.messages, oversea.messages) && s.areEqual(this.language, oversea.language) && s.areEqual(this.enableContext, oversea.enableContext) && s.areEqual(this.enableSearch, oversea.enableSearch);
        }

        public int hashCode() {
            int hashCode = ((((this.qid.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.userId.hashCode()) * 31;
            Boolean bool = this.stream;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.max_tokens;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            List<Messages> list = this.messages;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.language;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.enableContext;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.enableSearch;
            return hashCode6 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public String toString() {
            return "Oversea(qid=" + this.qid + ", prompt=" + this.prompt + ", userId=" + this.userId + ", stream=" + this.stream + ", max_tokens=" + this.max_tokens + ", messages=" + this.messages + ", language=" + this.language + ", enableContext=" + this.enableContext + ", enableSearch=" + this.enableSearch + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.qid);
            out.writeString(this.prompt);
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
            List<Messages> list = this.messages;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                Iterator<Messages> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(out, i8);
                }
            }
            out.writeString(this.language);
            Boolean bool2 = this.enableContext;
            if (bool2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.enableSearch;
            if (bool3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool3.booleanValue() ? 1 : 0);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid) {
            this(qid, null, null, null, null, null, null, null, null, 510, null);
            s.checkNotNullParameter(qid, "qid");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt) {
            this(qid, prompt, null, null, null, null, null, null, null, 508, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt, String userId) {
            this(qid, prompt, userId, null, null, null, null, null, null, 504, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt, String userId, Boolean bool) {
            this(qid, prompt, userId, bool, null, null, null, null, null, 496, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt, String userId, Boolean bool, Integer num) {
            this(qid, prompt, userId, bool, num, null, null, null, null, 480, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt, String userId, Boolean bool, Integer num, List<Messages> list) {
            this(qid, prompt, userId, bool, num, list, null, null, null, 448, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt, String userId, Boolean bool, Integer num, List<Messages> list, String str) {
            this(qid, prompt, userId, bool, num, list, str, null, null, RendererCapabilities.MODE_SUPPORT_MASK, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Oversea(String qid, String prompt, String userId, Boolean bool, Integer num, List<Messages> list, String str, Boolean bool2) {
            this(qid, prompt, userId, bool, num, list, str, bool2, null, 256, null);
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
        }

        public Oversea(String qid, String prompt, String userId, Boolean bool, Integer num, List<Messages> list, String str, Boolean bool2, Boolean bool3) {
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(prompt, "prompt");
            s.checkNotNullParameter(userId, "userId");
            this.qid = qid;
            this.prompt = prompt;
            this.userId = userId;
            this.stream = bool;
            this.max_tokens = num;
            this.messages = list;
            this.language = str;
            this.enableContext = bool2;
            this.enableSearch = bool3;
        }

        public /* synthetic */ Oversea(String str, String str2, String str3, Boolean bool, Integer num, List list, String str4, Boolean bool2, Boolean bool3, int i8, o oVar) {
            this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) == 0 ? str3 : "", (i8 & 8) != 0 ? Boolean.TRUE : bool, (i8 & 16) != 0 ? 200 : num, (i8 & 32) != 0 ? null : list, (i8 & 64) == 0 ? str4 : null, (i8 & 128) != 0 ? Boolean.FALSE : bool2, (i8 & 256) != 0 ? Boolean.FALSE : bool3);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final ChatRequestBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new ChatRequestBody(parcel.readInt() == 0 ? null : Oversea.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? DcsData.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChatRequestBody[] newArray(int i8) {
            return new ChatRequestBody[i8];
        }
    }

    public ChatRequestBody() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Oversea component1() {
        return this.oversea;
    }

    public final Data component2() {
        return this.data;
    }

    public final String component3() {
        return this.pid;
    }

    public final Integer component4() {
        return this.mode;
    }

    public final DcsData component5() {
        return this.dcs_data;
    }

    public final String component6() {
        return this.userId;
    }

    public final String component7() {
        return this.qid;
    }

    public final String component8() {
        return this.tid;
    }

    public final ChatRequestBody copy(Oversea oversea, Data data, String str, Integer num, DcsData dcsData, String str2, String str3, String tid) {
        s.checkNotNullParameter(tid, "tid");
        return new ChatRequestBody(oversea, data, str, num, dcsData, str2, str3, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatRequestBody)) {
            return false;
        }
        ChatRequestBody chatRequestBody = (ChatRequestBody) obj;
        return s.areEqual(this.oversea, chatRequestBody.oversea) && s.areEqual(this.data, chatRequestBody.data) && s.areEqual(this.pid, chatRequestBody.pid) && s.areEqual(this.mode, chatRequestBody.mode) && s.areEqual(this.dcs_data, chatRequestBody.dcs_data) && s.areEqual(this.userId, chatRequestBody.userId) && s.areEqual(this.qid, chatRequestBody.qid) && s.areEqual(this.tid, chatRequestBody.tid);
    }

    public final String getTid() {
        return this.tid;
    }

    public int hashCode() {
        Oversea oversea = this.oversea;
        int hashCode = (oversea == null ? 0 : oversea.hashCode()) * 31;
        Data data = this.data;
        int hashCode2 = (hashCode + (data == null ? 0 : data.hashCode())) * 31;
        String str = this.pid;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.mode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        DcsData dcsData = this.dcs_data;
        int hashCode5 = (hashCode4 + (dcsData == null ? 0 : dcsData.hashCode())) * 31;
        String str2 = this.userId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qid;
        return ((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "ChatRequestBody(oversea=" + this.oversea + ", data=" + this.data + ", pid=" + this.pid + ", mode=" + this.mode + ", dcs_data=" + this.dcs_data + ", userId=" + this.userId + ", qid=" + this.qid + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        Oversea oversea = this.oversea;
        if (oversea == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oversea.writeToParcel(out, i8);
        }
        Data data = this.data;
        if (data == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            data.writeToParcel(out, i8);
        }
        out.writeString(this.pid);
        Integer num = this.mode;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        DcsData dcsData = this.dcs_data;
        if (dcsData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dcsData.writeToParcel(out, i8);
        }
        out.writeString(this.userId);
        out.writeString(this.qid);
        out.writeString(this.tid);
    }

    public ChatRequestBody(Oversea oversea) {
        this(oversea, null, null, null, null, null, null, null, GattError.GATT_PRC_IN_PROGRESS, null);
    }

    public ChatRequestBody(Oversea oversea, Data data) {
        this(oversea, data, null, null, null, null, null, null, 252, null);
    }

    public ChatRequestBody(Oversea oversea, Data data, String str) {
        this(oversea, data, str, null, null, null, null, null, 248, null);
    }

    public ChatRequestBody(Oversea oversea, Data data, String str, Integer num) {
        this(oversea, data, str, num, null, null, null, null, 240, null);
    }

    public ChatRequestBody(Oversea oversea, Data data, String str, Integer num, DcsData dcsData) {
        this(oversea, data, str, num, dcsData, null, null, null, 224, null);
    }

    public ChatRequestBody(Oversea oversea, Data data, String str, Integer num, DcsData dcsData, String str2) {
        this(oversea, data, str, num, dcsData, str2, null, null, PsExtractor.AUDIO_STREAM, null);
    }

    public ChatRequestBody(Oversea oversea, Data data, String str, Integer num, DcsData dcsData, String str2, String str3) {
        this(oversea, data, str, num, dcsData, str2, str3, null, 128, null);
    }

    public ChatRequestBody(Oversea oversea, Data data, String str, Integer num, DcsData dcsData, String str2, String str3, String tid) {
        s.checkNotNullParameter(tid, "tid");
        this.oversea = oversea;
        this.data = data;
        this.pid = str;
        this.mode = num;
        this.dcs_data = dcsData;
        this.userId = str2;
        this.qid = str3;
        this.tid = tid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChatRequestBody(Oversea oversea, Data data, String str, Integer num, DcsData dcsData, String str2, String str3, String str4, int i8, o oVar) {
        this(r1, r2, r3, r4, r5, r6, r7, (i8 & 128) != 0 ? "" : str4);
        String str5;
        Oversea oversea2 = (i8 & 1) != 0 ? null : oversea;
        Data data2 = (i8 & 2) != 0 ? new Data(null, false, 0, null, 15, null) : data;
        String str6 = (i8 & 4) != 0 ? "104" : str;
        Integer num2 = (i8 & 8) != 0 ? 0 : num;
        DcsData dcsData2 = (i8 & 16) != 0 ? new DcsData(null, null, null, null, 15, null) : dcsData;
        String uniqueDeviceId = (i8 & 32) != 0 ? DeviceUtils.getUniqueDeviceId() : str2;
        if ((i8 & 64) != 0) {
            str5 = System.currentTimeMillis() + "-chat";
        } else {
            str5 = str3;
        }
    }
}
