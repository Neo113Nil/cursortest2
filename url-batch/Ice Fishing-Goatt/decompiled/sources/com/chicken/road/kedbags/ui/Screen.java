package com.chicken.road.kedbags.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppRoot.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/chicken/road/kedbags/ui/Screen;", "", "Splash", "Home", "Catalog", "Detail", "Quiz", "Lcom/chicken/road/kedbags/ui/Screen$Catalog;", "Lcom/chicken/road/kedbags/ui/Screen$Detail;", "Lcom/chicken/road/kedbags/ui/Screen$Home;", "Lcom/chicken/road/kedbags/ui/Screen$Quiz;", "Lcom/chicken/road/kedbags/ui/Screen$Splash;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
interface Screen {

    /* compiled from: AppRoot.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/chicken/road/kedbags/ui/Screen$Splash;", "Lcom/chicken/road/kedbags/ui/Screen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Splash implements Screen {
        public static final int $stable = 0;
        public static final Splash INSTANCE = new Splash();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Splash)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1447450704;
        }

        public String toString() {
            return "Splash";
        }

        private Splash() {
        }
    }

    /* compiled from: AppRoot.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/chicken/road/kedbags/ui/Screen$Home;", "Lcom/chicken/road/kedbags/ui/Screen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home implements Screen {
        public static final int $stable = 0;
        public static final Home INSTANCE = new Home();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Home)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -374241016;
        }

        public String toString() {
            return "Home";
        }

        private Home() {
        }
    }

    /* compiled from: AppRoot.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/chicken/road/kedbags/ui/Screen$Catalog;", "Lcom/chicken/road/kedbags/ui/Screen;", "tag", "", "<init>", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Catalog implements Screen {
        public static final int $stable = 0;
        private final String tag;

        /* JADX WARN: Multi-variable type inference failed */
        public Catalog() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Catalog copy$default(Catalog catalog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = catalog.tag;
            }
            return catalog.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final Catalog copy(String tag) {
            return new Catalog(tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Catalog) && Intrinsics.areEqual(this.tag, ((Catalog) other).tag);
        }

        public int hashCode() {
            String str = this.tag;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Catalog(tag=" + this.tag + ")";
        }

        public Catalog(String str) {
            this.tag = str;
        }

        public /* synthetic */ Catalog(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* compiled from: AppRoot.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/chicken/road/kedbags/ui/Screen$Detail;", "Lcom/chicken/road/kedbags/ui/Screen;", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Detail implements Screen {
        public static final int $stable = 0;
        private final int id;

        public static /* synthetic */ Detail copy$default(Detail detail, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = detail.id;
            }
            return detail.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final Detail copy(int id) {
            return new Detail(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Detail) && this.id == ((Detail) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return "Detail(id=" + this.id + ")";
        }

        public Detail(int i) {
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: AppRoot.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/chicken/road/kedbags/ui/Screen$Quiz;", "Lcom/chicken/road/kedbags/ui/Screen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Quiz implements Screen {
        public static final int $stable = 0;
        public static final Quiz INSTANCE = new Quiz();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Quiz)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -373967234;
        }

        public String toString() {
            return "Quiz";
        }

        private Quiz() {
        }
    }
}
