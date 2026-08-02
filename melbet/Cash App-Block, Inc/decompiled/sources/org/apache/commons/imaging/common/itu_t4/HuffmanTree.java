package org.apache.commons.imaging.common.itu_t4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
class HuffmanTree<T> {
    private final List<Node<T>> nodes = new ArrayList();

    public static final class Node<T> {
        boolean empty;
        T value;

        private Node() {
            this.empty = true;
        }
    }

    private Node<T> growAndGetNode(int i) {
        while (true) {
            int size = this.nodes.size();
            List<Node<T>> list = this.nodes;
            if (i < size) {
                Node<T> node = list.get(i);
                node.empty = false;
                return node;
            }
            list.add(new Node<>());
        }
    }

    public final T decode(BitInputStreamFlexible bitInputStreamFlexible) {
        int i = 0;
        Node<T> node = this.nodes.get(0);
        do {
            T t = node.value;
            if (t != null) {
                return t;
            }
            try {
                i = bitInputStreamFlexible.readBits(1) == 0 ? (i << 1) + 1 : (i + 1) << 1;
                if (i >= this.nodes.size()) {
                    throw new HuffmanTreeException("Invalid bit pattern");
                }
                node = this.nodes.get(i);
            } catch (IOException e) {
                throw new HuffmanTreeException("Error reading stream for huffman tree", e);
            }
        } while (!node.empty);
        throw new HuffmanTreeException("Invalid bit pattern");
    }

    public final void insert(String str, T t) {
        Node<T> growAndGetNode = growAndGetNode(0);
        if (growAndGetNode.value != null) {
            throw new HuffmanTreeException("Can't add child to a leaf");
        }
        Node<T> node = growAndGetNode;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = str.charAt(i2) == '0' ? (i << 1) + 1 : (i + 1) << 1;
            node = growAndGetNode(i);
            if (node.value != null) {
                throw new HuffmanTreeException("Can't add child to a leaf");
            }
        }
        node.value = t;
    }
}
