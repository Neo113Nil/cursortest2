package org.intellij.markdown.parser.sequentialparsers;

import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer$filter$3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes10.dex */
public interface SequentialParser {

    public final class Node {
        public final IntRange range;

        /* renamed from: type, reason: collision with root package name */
        public final MarkdownElementType f1633type;

        public Node(IntRange intRange, MarkdownElementType markdownElementType) {
            markdownElementType.getClass();
            this.range = intRange;
            this.f1633type = markdownElementType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Node)) {
                return false;
            }
            Node node = (Node) obj;
            return this.range.equals(node.range) && Intrinsics.areEqual(this.f1633type, node.f1633type);
        }

        public final int hashCode() {
            return this.f1633type.hashCode() + (this.range.hashCode() * 31);
        }

        public final String toString() {
            return "Node(range=" + this.range + ", type=" + this.f1633type + ')';
        }
    }

    USPhoneNumberVisualTransformer$filter$3 parse(p0 p0Var, List list);
}
