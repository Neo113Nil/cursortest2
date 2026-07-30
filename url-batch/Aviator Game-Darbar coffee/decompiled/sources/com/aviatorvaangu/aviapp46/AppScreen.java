package com.aviatorvaangu.aviapp46;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.data.GuideTopic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AviatorFlyingGuideApp.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen;", "", "Splash", "Onboarding", "Start", "Setup", "Home", "Topics", "Detail", "Lcom/aviatorvaangu/aviapp46/AppScreen$Detail;", "Lcom/aviatorvaangu/aviapp46/AppScreen$Home;", "Lcom/aviatorvaangu/aviapp46/AppScreen$Onboarding;", "Lcom/aviatorvaangu/aviapp46/AppScreen$Setup;", "Lcom/aviatorvaangu/aviapp46/AppScreen$Splash;", "Lcom/aviatorvaangu/aviapp46/AppScreen$Start;", "Lcom/aviatorvaangu/aviapp46/AppScreen$Topics;", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
interface AppScreen {

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Splash;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Splash implements AppScreen {
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
            return -1588884068;
        }

        public String toString() {
            return "Splash";
        }

        private Splash() {
        }
    }

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Onboarding;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "page", "", "<init>", "(I)V", "getPage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Onboarding implements AppScreen {
        public static final int $stable = 0;
        private final int page;

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onboarding.page;
            }
            return onboarding.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPage() {
            return this.page;
        }

        public final Onboarding copy(int page) {
            return new Onboarding(page);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Onboarding) && this.page == ((Onboarding) other).page;
        }

        public int hashCode() {
            return Integer.hashCode(this.page);
        }

        public String toString() {
            return "Onboarding(page=" + this.page + ")";
        }

        public Onboarding(int i) {
            this.page = i;
        }

        public final int getPage() {
            return this.page;
        }
    }

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Start;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Start implements AppScreen {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Start)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 87402125;
        }

        public String toString() {
            return "Start";
        }

        private Start() {
        }
    }

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Setup;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "step", "", "<init>", "(I)V", "getStep", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Setup implements AppScreen {
        public static final int $stable = 0;
        private final int step;

        public static /* synthetic */ Setup copy$default(Setup setup, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setup.step;
            }
            return setup.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStep() {
            return this.step;
        }

        public final Setup copy(int step) {
            return new Setup(step);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Setup) && this.step == ((Setup) other).step;
        }

        public int hashCode() {
            return Integer.hashCode(this.step);
        }

        public String toString() {
            return "Setup(step=" + this.step + ")";
        }

        public Setup(int i) {
            this.step = i;
        }

        public final int getStep() {
            return this.step;
        }
    }

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Home;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Home implements AppScreen {
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
            return -690249388;
        }

        public String toString() {
            return "Home";
        }

        private Home() {
        }
    }

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Topics;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Topics implements AppScreen {
        public static final int $stable = 0;
        public static final Topics INSTANCE = new Topics();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Topics)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1561052071;
        }

        public String toString() {
            return "Topics";
        }

        private Topics() {
        }
    }

    /* compiled from: AviatorFlyingGuideApp.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/aviatorvaangu/aviapp46/AppScreen$Detail;", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "topic", "Lcom/aviatorvaangu/aviapp46/data/GuideTopic;", "<init>", "(Lcom/aviatorvaangu/aviapp46/data/GuideTopic;)V", "getTopic", "()Lcom/aviatorvaangu/aviapp46/data/GuideTopic;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Detail implements AppScreen {
        public static final int $stable = 0;
        private final GuideTopic topic;

        public static /* synthetic */ Detail copy$default(Detail detail, GuideTopic guideTopic, int i, Object obj) {
            if ((i & 1) != 0) {
                guideTopic = detail.topic;
            }
            return detail.copy(guideTopic);
        }

        /* renamed from: component1, reason: from getter */
        public final GuideTopic getTopic() {
            return this.topic;
        }

        public final Detail copy(GuideTopic topic) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            return new Detail(topic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Detail) && Intrinsics.areEqual(this.topic, ((Detail) other).topic);
        }

        public int hashCode() {
            return this.topic.hashCode();
        }

        public String toString() {
            return "Detail(topic=" + this.topic + ")";
        }

        public Detail(GuideTopic topic) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            this.topic = topic;
        }

        public final GuideTopic getTopic() {
            return this.topic;
        }
    }
}
