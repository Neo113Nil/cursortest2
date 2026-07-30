package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text2ImageResult implements Parcelable {
    public static final Parcelable.Creator<Text2ImageResult> CREATOR = new a();
    private final String message;
    private final RowResult rows;
    private final String status;

    @Keep
    public static final class ErrorData implements Parcelable {
        public static final Parcelable.Creator<ErrorData> CREATOR = new a();
        private final Integer error_code;
        private final String error_msg;
        private final Long log_id;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final ErrorData createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new ErrorData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorData[] newArray(int i8) {
                return new ErrorData[i8];
            }
        }

        public ErrorData(Integer num, Long l8, String str) {
            this.error_code = num;
            this.log_id = l8;
            this.error_msg = str;
        }

        public static /* synthetic */ ErrorData copy$default(ErrorData errorData, Integer num, Long l8, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                num = errorData.error_code;
            }
            if ((i8 & 2) != 0) {
                l8 = errorData.log_id;
            }
            if ((i8 & 4) != 0) {
                str = errorData.error_msg;
            }
            return errorData.copy(num, l8, str);
        }

        public final Integer component1() {
            return this.error_code;
        }

        public final Long component2() {
            return this.log_id;
        }

        public final String component3() {
            return this.error_msg;
        }

        public final ErrorData copy(Integer num, Long l8, String str) {
            return new ErrorData(num, l8, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorData)) {
                return false;
            }
            ErrorData errorData = (ErrorData) obj;
            return s.areEqual(this.error_code, errorData.error_code) && s.areEqual(this.log_id, errorData.log_id) && s.areEqual(this.error_msg, errorData.error_msg);
        }

        public final Integer getError_code() {
            return this.error_code;
        }

        public final String getError_msg() {
            return this.error_msg;
        }

        public final Long getLog_id() {
            return this.log_id;
        }

        public int hashCode() {
            Integer num = this.error_code;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l8 = this.log_id;
            int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str = this.error_msg;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ErrorData(error_code=" + this.error_code + ", log_id=" + this.log_id + ", error_msg=" + this.error_msg + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            Integer num = this.error_code;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Long l8 = this.log_id;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.error_msg);
        }
    }

    @Keep
    public static final class RowDataResult implements Parcelable {
        public static final Parcelable.Creator<RowDataResult> CREATOR = new a();
        private final ErrorData data;
        private final String message;
        private final List<TaskResult> sub_task_result_list;
        private final int task_id;
        private final int task_progress;
        private final String task_status;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final RowDataResult createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                s.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    for (int i8 = 0; i8 != readInt2; i8++) {
                        arrayList.add(TaskResult.CREATOR.createFromParcel(parcel));
                    }
                }
                return new RowDataResult(readString, readInt, arrayList, parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? ErrorData.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final RowDataResult[] newArray(int i8) {
                return new RowDataResult[i8];
            }
        }

        public RowDataResult(String task_status, int i8, List<TaskResult> list, int i9, String str, ErrorData errorData) {
            s.checkNotNullParameter(task_status, "task_status");
            this.task_status = task_status;
            this.task_progress = i8;
            this.sub_task_result_list = list;
            this.task_id = i9;
            this.message = str;
            this.data = errorData;
        }

        public static /* synthetic */ RowDataResult copy$default(RowDataResult rowDataResult, String str, int i8, List list, int i9, String str2, ErrorData errorData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = rowDataResult.task_status;
            }
            if ((i10 & 2) != 0) {
                i8 = rowDataResult.task_progress;
            }
            int i11 = i8;
            if ((i10 & 4) != 0) {
                list = rowDataResult.sub_task_result_list;
            }
            List list2 = list;
            if ((i10 & 8) != 0) {
                i9 = rowDataResult.task_id;
            }
            int i12 = i9;
            if ((i10 & 16) != 0) {
                str2 = rowDataResult.message;
            }
            String str3 = str2;
            if ((i10 & 32) != 0) {
                errorData = rowDataResult.data;
            }
            return rowDataResult.copy(str, i11, list2, i12, str3, errorData);
        }

        public final String component1() {
            return this.task_status;
        }

        public final int component2() {
            return this.task_progress;
        }

        public final List<TaskResult> component3() {
            return this.sub_task_result_list;
        }

        public final int component4() {
            return this.task_id;
        }

        public final String component5() {
            return this.message;
        }

        public final ErrorData component6() {
            return this.data;
        }

        public final RowDataResult copy(String task_status, int i8, List<TaskResult> list, int i9, String str, ErrorData errorData) {
            s.checkNotNullParameter(task_status, "task_status");
            return new RowDataResult(task_status, i8, list, i9, str, errorData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowDataResult)) {
                return false;
            }
            RowDataResult rowDataResult = (RowDataResult) obj;
            return s.areEqual(this.task_status, rowDataResult.task_status) && this.task_progress == rowDataResult.task_progress && s.areEqual(this.sub_task_result_list, rowDataResult.sub_task_result_list) && this.task_id == rowDataResult.task_id && s.areEqual(this.message, rowDataResult.message) && s.areEqual(this.data, rowDataResult.data);
        }

        public final ErrorData getData() {
            return this.data;
        }

        public final String getErrorMsg() {
            ErrorData errorData = this.data;
            String error_msg = errorData != null ? errorData.getError_msg() : null;
            return error_msg == null ? "" : error_msg;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<TaskResult> getSub_task_result_list() {
            return this.sub_task_result_list;
        }

        public final int getTask_id() {
            return this.task_id;
        }

        public final int getTask_progress() {
            return this.task_progress;
        }

        public final String getTask_status() {
            return this.task_status;
        }

        public int hashCode() {
            int hashCode = ((this.task_status.hashCode() * 31) + this.task_progress) * 31;
            List<TaskResult> list = this.sub_task_result_list;
            int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.task_id) * 31;
            String str = this.message;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ErrorData errorData = this.data;
            return hashCode3 + (errorData != null ? errorData.hashCode() : 0);
        }

        public final boolean isErrorList() {
            ErrorData errorData = this.data;
            Integer error_code = errorData != null ? errorData.getError_code() : null;
            return (error_code != null && error_code.intValue() == 282000) || (error_code != null && error_code.intValue() == 216303) || ((error_code != null && error_code.intValue() == 282004) || ((error_code != null && error_code.intValue() == 282003) || ((error_code != null && error_code.intValue() == 216630) || ((error_code != null && error_code.intValue() == 501) || ((error_code != null && error_code.intValue() == 503) || ((error_code != null && error_code.intValue() == 201) || ((error_code != null && error_code.intValue() == 216100) || (error_code != null && error_code.intValue() == 216201))))))));
        }

        public final boolean isTaskSuccess() {
            return s.areEqual(this.task_status, "SUCCESS");
        }

        public String toString() {
            return "RowDataResult(task_status=" + this.task_status + ", task_progress=" + this.task_progress + ", sub_task_result_list=" + this.sub_task_result_list + ", task_id=" + this.task_id + ", message=" + this.message + ", data=" + this.data + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.task_status);
            out.writeInt(this.task_progress);
            List<TaskResult> list = this.sub_task_result_list;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                Iterator<TaskResult> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(out, i8);
                }
            }
            out.writeInt(this.task_id);
            out.writeString(this.message);
            ErrorData errorData = this.data;
            if (errorData == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                errorData.writeToParcel(out, i8);
            }
        }
    }

    @Keep
    public static final class RowResult implements Parcelable {
        public static final Parcelable.Creator<RowResult> CREATOR = new a();
        private final RowDataResult data;
        private final String log_id;
        private final String qid;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final RowResult createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new RowResult(parcel.readString(), parcel.readInt() == 0 ? null : RowDataResult.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RowResult[] newArray(int i8) {
                return new RowResult[i8];
            }
        }

        public RowResult(String qid, RowDataResult rowDataResult, String log_id) {
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(log_id, "log_id");
            this.qid = qid;
            this.data = rowDataResult;
            this.log_id = log_id;
        }

        public static /* synthetic */ RowResult copy$default(RowResult rowResult, String str, RowDataResult rowDataResult, String str2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = rowResult.qid;
            }
            if ((i8 & 2) != 0) {
                rowDataResult = rowResult.data;
            }
            if ((i8 & 4) != 0) {
                str2 = rowResult.log_id;
            }
            return rowResult.copy(str, rowDataResult, str2);
        }

        public final String component1() {
            return this.qid;
        }

        public final RowDataResult component2() {
            return this.data;
        }

        public final String component3() {
            return this.log_id;
        }

        public final RowResult copy(String qid, RowDataResult rowDataResult, String log_id) {
            s.checkNotNullParameter(qid, "qid");
            s.checkNotNullParameter(log_id, "log_id");
            return new RowResult(qid, rowDataResult, log_id);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowResult)) {
                return false;
            }
            RowResult rowResult = (RowResult) obj;
            return s.areEqual(this.qid, rowResult.qid) && s.areEqual(this.data, rowResult.data) && s.areEqual(this.log_id, rowResult.log_id);
        }

        public final RowDataResult getData() {
            return this.data;
        }

        public final String getLog_id() {
            return this.log_id;
        }

        public final String getQid() {
            return this.qid;
        }

        public int hashCode() {
            int hashCode = this.qid.hashCode() * 31;
            RowDataResult rowDataResult = this.data;
            return ((hashCode + (rowDataResult == null ? 0 : rowDataResult.hashCode())) * 31) + this.log_id.hashCode();
        }

        public String toString() {
            return "RowResult(qid=" + this.qid + ", data=" + this.data + ", log_id=" + this.log_id + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.qid);
            RowDataResult rowDataResult = this.data;
            if (rowDataResult == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                rowDataResult.writeToParcel(out, i8);
            }
            out.writeString(this.log_id);
        }
    }

    @Keep
    public static final class TaskImageResult implements Parcelable {
        public static final Parcelable.Creator<TaskImageResult> CREATOR = new a();
        private final int height;
        private final String img_approve_conclusion;
        private final String img_url;
        private final int width;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final TaskImageResult createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new TaskImageResult(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TaskImageResult[] newArray(int i8) {
                return new TaskImageResult[i8];
            }
        }

        public TaskImageResult(int i8, int i9, String img_url, String img_approve_conclusion) {
            s.checkNotNullParameter(img_url, "img_url");
            s.checkNotNullParameter(img_approve_conclusion, "img_approve_conclusion");
            this.width = i8;
            this.height = i9;
            this.img_url = img_url;
            this.img_approve_conclusion = img_approve_conclusion;
        }

        public static /* synthetic */ TaskImageResult copy$default(TaskImageResult taskImageResult, int i8, int i9, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = taskImageResult.width;
            }
            if ((i10 & 2) != 0) {
                i9 = taskImageResult.height;
            }
            if ((i10 & 4) != 0) {
                str = taskImageResult.img_url;
            }
            if ((i10 & 8) != 0) {
                str2 = taskImageResult.img_approve_conclusion;
            }
            return taskImageResult.copy(i8, i9, str, str2);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final String component3() {
            return this.img_url;
        }

        public final String component4() {
            return this.img_approve_conclusion;
        }

        public final TaskImageResult copy(int i8, int i9, String img_url, String img_approve_conclusion) {
            s.checkNotNullParameter(img_url, "img_url");
            s.checkNotNullParameter(img_approve_conclusion, "img_approve_conclusion");
            return new TaskImageResult(i8, i9, img_url, img_approve_conclusion);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskImageResult)) {
                return false;
            }
            TaskImageResult taskImageResult = (TaskImageResult) obj;
            return this.width == taskImageResult.width && this.height == taskImageResult.height && s.areEqual(this.img_url, taskImageResult.img_url) && s.areEqual(this.img_approve_conclusion, taskImageResult.img_approve_conclusion);
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getImg_approve_conclusion() {
            return this.img_approve_conclusion;
        }

        public final String getImg_url() {
            return this.img_url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((((this.width * 31) + this.height) * 31) + this.img_url.hashCode()) * 31) + this.img_approve_conclusion.hashCode();
        }

        public String toString() {
            return "TaskImageResult(width=" + this.width + ", height=" + this.height + ", img_url=" + this.img_url + ", img_approve_conclusion=" + this.img_approve_conclusion + ')';
        }

        public final String valueKey() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.width);
            sb.append('x');
            sb.append(this.height);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(this.width);
            out.writeInt(this.height);
            out.writeString(this.img_url);
            out.writeString(this.img_approve_conclusion);
        }
    }

    @Keep
    public static final class TaskResult implements Parcelable {
        public static final Parcelable.Creator<TaskResult> CREATOR = new a();
        private final List<TaskImageResult> final_image_list;
        private final int sub_task_error_code;
        private final int sub_task_progress;
        private final String sub_task_status;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final TaskResult createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(TaskImageResult.CREATOR.createFromParcel(parcel));
                }
                return new TaskResult(arrayList, parcel.readInt(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final TaskResult[] newArray(int i8) {
                return new TaskResult[i8];
            }
        }

        public TaskResult(List<TaskImageResult> final_image_list, int i8, String sub_task_status, int i9) {
            s.checkNotNullParameter(final_image_list, "final_image_list");
            s.checkNotNullParameter(sub_task_status, "sub_task_status");
            this.final_image_list = final_image_list;
            this.sub_task_error_code = i8;
            this.sub_task_status = sub_task_status;
            this.sub_task_progress = i9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskResult copy$default(TaskResult taskResult, List list, int i8, String str, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = taskResult.final_image_list;
            }
            if ((i10 & 2) != 0) {
                i8 = taskResult.sub_task_error_code;
            }
            if ((i10 & 4) != 0) {
                str = taskResult.sub_task_status;
            }
            if ((i10 & 8) != 0) {
                i9 = taskResult.sub_task_progress;
            }
            return taskResult.copy(list, i8, str, i9);
        }

        public final List<TaskImageResult> component1() {
            return this.final_image_list;
        }

        public final int component2() {
            return this.sub_task_error_code;
        }

        public final String component3() {
            return this.sub_task_status;
        }

        public final int component4() {
            return this.sub_task_progress;
        }

        public final TaskResult copy(List<TaskImageResult> final_image_list, int i8, String sub_task_status, int i9) {
            s.checkNotNullParameter(final_image_list, "final_image_list");
            s.checkNotNullParameter(sub_task_status, "sub_task_status");
            return new TaskResult(final_image_list, i8, sub_task_status, i9);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskResult)) {
                return false;
            }
            TaskResult taskResult = (TaskResult) obj;
            return s.areEqual(this.final_image_list, taskResult.final_image_list) && this.sub_task_error_code == taskResult.sub_task_error_code && s.areEqual(this.sub_task_status, taskResult.sub_task_status) && this.sub_task_progress == taskResult.sub_task_progress;
        }

        public final List<TaskImageResult> getFinal_image_list() {
            return this.final_image_list;
        }

        public final int getSub_task_error_code() {
            return this.sub_task_error_code;
        }

        public final int getSub_task_progress() {
            return this.sub_task_progress;
        }

        public final String getSub_task_status() {
            return this.sub_task_status;
        }

        public int hashCode() {
            return (((((this.final_image_list.hashCode() * 31) + this.sub_task_error_code) * 31) + this.sub_task_status.hashCode()) * 31) + this.sub_task_progress;
        }

        public String toString() {
            return "TaskResult(final_image_list=" + this.final_image_list + ", sub_task_error_code=" + this.sub_task_error_code + ", sub_task_status=" + this.sub_task_status + ", sub_task_progress=" + this.sub_task_progress + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            List<TaskImageResult> list = this.final_image_list;
            out.writeInt(list.size());
            Iterator<TaskImageResult> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i8);
            }
            out.writeInt(this.sub_task_error_code);
            out.writeString(this.sub_task_status);
            out.writeInt(this.sub_task_progress);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Text2ImageResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Text2ImageResult(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RowResult.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Text2ImageResult[] newArray(int i8) {
            return new Text2ImageResult[i8];
        }
    }

    public Text2ImageResult(String status, String str, RowResult rowResult) {
        s.checkNotNullParameter(status, "status");
        this.status = status;
        this.message = str;
        this.rows = rowResult;
    }

    public static /* synthetic */ Text2ImageResult copy$default(Text2ImageResult text2ImageResult, String str, String str2, RowResult rowResult, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = text2ImageResult.status;
        }
        if ((i8 & 2) != 0) {
            str2 = text2ImageResult.message;
        }
        if ((i8 & 4) != 0) {
            rowResult = text2ImageResult.rows;
        }
        return text2ImageResult.copy(str, str2, rowResult);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final RowResult component3() {
        return this.rows;
    }

    public final Text2ImageResult copy(String status, String str, RowResult rowResult) {
        s.checkNotNullParameter(status, "status");
        return new Text2ImageResult(status, str, rowResult);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageResult)) {
            return false;
        }
        Text2ImageResult text2ImageResult = (Text2ImageResult) obj;
        return s.areEqual(this.status, text2ImageResult.status) && s.areEqual(this.message, text2ImageResult.message) && s.areEqual(this.rows, text2ImageResult.rows);
    }

    public final int getErrorCode(int i8) {
        RowDataResult data;
        ErrorData data2;
        Integer error_code;
        RowResult rowResult = this.rows;
        return (rowResult == null || (data = rowResult.getData()) == null || (data2 = data.getData()) == null || (error_code = data2.getError_code()) == null) ? i8 : error_code.intValue();
    }

    public final String getErrorMsg() {
        RowDataResult data;
        RowResult rowResult = this.rows;
        String errorMsg = (rowResult == null || (data = rowResult.getData()) == null) ? null : data.getErrorMsg();
        return errorMsg == null ? "" : errorMsg;
    }

    public final String getMessage() {
        return this.message;
    }

    public final RowResult getRows() {
        return this.rows;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RowResult rowResult = this.rows;
        return hashCode2 + (rowResult != null ? rowResult.hashCode() : 0);
    }

    public final boolean isErrorList() {
        RowDataResult data;
        RowResult rowResult = this.rows;
        if (rowResult == null || (data = rowResult.getData()) == null) {
            return false;
        }
        return data.isErrorList();
    }

    public final boolean isSuccess() {
        RowResult rowResult;
        RowDataResult data;
        return s.areEqual(this.status, FirebaseAnalytics.Param.SUCCESS) && (rowResult = this.rows) != null && (data = rowResult.getData()) != null && data.isTaskSuccess();
    }

    public String toString() {
        return "Text2ImageResult(status=" + this.status + ", message=" + this.message + ", rows=" + this.rows + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.status);
        out.writeString(this.message);
        RowResult rowResult = this.rows;
        if (rowResult == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rowResult.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ Text2ImageResult(String str, String str2, RowResult rowResult, int i8, o oVar) {
        this(str, str2, (i8 & 4) != 0 ? null : rowResult);
    }
}
