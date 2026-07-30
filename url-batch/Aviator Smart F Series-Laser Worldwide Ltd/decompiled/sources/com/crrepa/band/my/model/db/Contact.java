package com.crrepa.band.my.model.db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Contact implements Parcelable {
    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() { // from class: com.crrepa.band.my.model.db.Contact.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Contact createFromParcel(Parcel parcel) {
            return new Contact(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Contact[] newArray(int i8) {
            return new Contact[i8];
        }
    };
    private String avatar;
    private Long id;
    private String name;
    private String number;

    public Contact(Long l8, String str, String str2, String str3) {
        this.id = l8;
        this.name = str;
        this.number = str2;
        this.avatar = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contact contact = (Contact) obj;
        return Objects.equals(this.id, contact.id) && this.name.equals(contact.name) && this.number.equals(contact.number) && this.avatar.equals(contact.avatar);
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name, this.number, this.avatar);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeValue(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.number);
        parcel.writeString(this.avatar);
    }

    public Contact() {
    }

    protected Contact(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.name = parcel.readString();
        this.number = parcel.readString();
        this.avatar = parcel.readString();
    }
}
