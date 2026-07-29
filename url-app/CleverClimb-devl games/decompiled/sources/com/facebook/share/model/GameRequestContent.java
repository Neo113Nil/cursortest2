package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new Parcelable.Creator<GameRequestContent>() { // from class: com.facebook.share.model.GameRequestContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    };
    private final a actionType;
    private final String data;
    private final c filters;
    private final String message;
    private final String objectId;
    private final List<String> recipients;
    private final List<String> suggestions;
    private final String title;

    public enum a {
        SEND,
        ASKFOR,
        TURN
    }

    public enum c {
        APP_USERS,
        APP_NON_USERS
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GameRequestContent(b bVar) {
        this.message = bVar.f6386a;
        this.recipients = bVar.f6387b;
        this.title = bVar.f6389d;
        this.data = bVar.f6388c;
        this.actionType = bVar.e;
        this.objectId = bVar.f;
        this.filters = bVar.g;
        this.suggestions = bVar.h;
    }

    GameRequestContent(Parcel parcel) {
        this.message = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (a) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (c) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
        parcel.readStringList(this.suggestions);
    }

    public String getMessage() {
        return this.message;
    }

    public List<String> getRecipients() {
        return this.recipients;
    }

    public String getTitle() {
        return this.title;
    }

    public String getData() {
        return this.data;
    }

    public a getActionType() {
        return this.actionType;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public c getFilters() {
        return this.filters;
    }

    public List<String> getSuggestions() {
        return this.suggestions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.message);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f6386a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f6387b;

        /* renamed from: c, reason: collision with root package name */
        private String f6388c;

        /* renamed from: d, reason: collision with root package name */
        private String f6389d;
        private a e;
        private String f;
        private c g;
        private List<String> h;

        public b a(String str) {
            this.f6386a = str;
            return this;
        }

        public b b(String str) {
            if (str != null) {
                this.f6387b = Arrays.asList(str.split(","));
            }
            return this;
        }

        public b c(String str) {
            this.f6389d = str;
            return this;
        }

        public GameRequestContent a() {
            return new GameRequestContent(this);
        }
    }
}
