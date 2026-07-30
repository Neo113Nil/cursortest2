package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class QueryBody<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<QueryBody<?>> CREATOR = new a();
    public List<? extends T> query;
    public String sn;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final QueryBody<?> createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(QueryBody.class.getClassLoader()));
            }
            return new QueryBody<>(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QueryBody<?>[] newArray(int i8) {
            return new QueryBody[i8];
        }
    }

    public QueryBody(List<? extends T> query, String sn) {
        s.checkNotNullParameter(query, "query");
        s.checkNotNullParameter(sn, "sn");
        this.query = query;
        this.sn = sn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryBody copy$default(QueryBody queryBody, List list, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = queryBody.query;
        }
        if ((i8 & 2) != 0) {
            str = queryBody.sn;
        }
        return queryBody.copy(list, str);
    }

    public final List<T> component1() {
        return this.query;
    }

    public final String component2() {
        return this.sn;
    }

    public final QueryBody<T> copy(List<? extends T> query, String sn) {
        s.checkNotNullParameter(query, "query");
        s.checkNotNullParameter(sn, "sn");
        return new QueryBody<>(query, sn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryBody)) {
            return false;
        }
        QueryBody queryBody = (QueryBody) obj;
        return s.areEqual(this.query, queryBody.query) && s.areEqual(this.sn, queryBody.sn);
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + this.sn.hashCode();
    }

    public String toString() {
        return "QueryBody(query=" + this.query + ", sn=" + this.sn + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        List<? extends T> list = this.query;
        out.writeInt(list.size());
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable(it.next(), i8);
        }
        out.writeString(this.sn);
    }
}
