package kotlin.text;

import java.util.List;

/* loaded from: classes3.dex */
public interface j {

    public static final class a {
        public static b getDestructured(j jVar) {
            return new b(jVar);
        }
    }

    public static final class b {
        private final j match;

        public b(j match) {
            kotlin.jvm.internal.s.checkNotNullParameter(match, "match");
            this.match = match;
        }

        private final String component1() {
            return getMatch().getGroupValues().get(1);
        }

        private final String component10() {
            return getMatch().getGroupValues().get(10);
        }

        private final String component2() {
            return getMatch().getGroupValues().get(2);
        }

        private final String component3() {
            return getMatch().getGroupValues().get(3);
        }

        private final String component4() {
            return getMatch().getGroupValues().get(4);
        }

        private final String component5() {
            return getMatch().getGroupValues().get(5);
        }

        private final String component6() {
            return getMatch().getGroupValues().get(6);
        }

        private final String component7() {
            return getMatch().getGroupValues().get(7);
        }

        private final String component8() {
            return getMatch().getGroupValues().get(8);
        }

        private final String component9() {
            return getMatch().getGroupValues().get(9);
        }

        public final j getMatch() {
            return this.match;
        }

        public final List<String> toList() {
            return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
        }
    }

    b getDestructured();

    List<String> getGroupValues();

    h getGroups();

    j6.m getRange();

    String getValue();

    j next();
}
