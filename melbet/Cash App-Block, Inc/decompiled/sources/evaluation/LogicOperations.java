package evaluation;

import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class LogicOperations {
    public final LinkedHashMap functionalOperations;
    public final LinkedHashMap standardOperations;

    public LogicOperations(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.standardOperations = linkedHashMap;
        this.functionalOperations = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogicOperations)) {
            return false;
        }
        LogicOperations logicOperations = (LogicOperations) obj;
        return this.standardOperations.equals(logicOperations.standardOperations) && this.functionalOperations.equals(logicOperations.functionalOperations);
    }

    public final int hashCode() {
        return this.functionalOperations.hashCode() + (this.standardOperations.hashCode() * 31);
    }

    public final String toString() {
        return "LogicOperations(standardOperations=" + this.standardOperations + ", functionalOperations=" + this.functionalOperations + ")";
    }
}
