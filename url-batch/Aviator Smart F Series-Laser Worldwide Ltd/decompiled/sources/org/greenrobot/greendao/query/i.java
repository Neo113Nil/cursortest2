package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
public class i implements List, Closeable {
    private final Cursor cursor;
    private final org.greenrobot.greendao.e daoAccess;
    private final List<Object> entities;
    private volatile int loadedCount;
    private final ReentrantLock lock;
    private final int size;

    protected class a implements d {
        private final boolean closeWhenDone;
        private int index;

        public a(int i8, boolean z7) {
            this.index = i8;
            this.closeWhenDone = z7;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i.this.close();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < i.this.size;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            if (this.index >= i.this.size) {
                throw new NoSuchElementException();
            }
            Object obj = i.this.get(this.index);
            int i8 = this.index + 1;
            this.index = i8;
            if (i8 == i.this.size && this.closeWhenDone) {
                close();
            }
            return obj;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i8 = this.index;
            if (i8 <= 0) {
                throw new NoSuchElementException();
            }
            int i9 = i8 - 1;
            this.index = i9;
            return i.this.get(i9);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    i(org.greenrobot.greendao.e eVar, Cursor cursor, boolean z7) {
        this.cursor = cursor;
        this.daoAccess = eVar;
        int count = cursor.getCount();
        this.size = count;
        if (z7) {
            this.entities = new ArrayList(count);
            for (int i8 = 0; i8 < this.size; i8++) {
                this.entities.add(null);
            }
        } else {
            this.entities = null;
        }
        if (this.size == 0) {
            cursor.close();
        }
        this.lock = new ReentrantLock();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    protected void checkCached() {
        if (this.entities == null) {
            throw new DaoException("This operation only works with cached lazy lists");
        }
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        loadRemaining();
        return this.entities.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        loadRemaining();
        return this.entities.containsAll(collection);
    }

    @Override // java.util.List
    public Object get(int i8) {
        List<Object> list = this.entities;
        if (list == null) {
            this.lock.lock();
            try {
                return loadEntity(i8);
            } finally {
            }
        }
        Object obj = list.get(i8);
        if (obj == null) {
            this.lock.lock();
            try {
                obj = this.entities.get(i8);
                if (obj == null) {
                    obj = loadEntity(i8);
                    this.entities.set(i8, obj);
                    this.loadedCount++;
                    if (this.loadedCount == this.size) {
                        this.cursor.close();
                    }
                }
            } finally {
            }
        }
        return obj;
    }

    public int getLoadedCount() {
        return this.loadedCount;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        loadRemaining();
        return this.entities.indexOf(obj);
    }

    public boolean isClosed() {
        return this.cursor.isClosed();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isLoadedCompletely() {
        return this.loadedCount == this.size;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new a(0, false);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        loadRemaining();
        return this.entities.lastIndexOf(obj);
    }

    public d listIteratorAutoClose() {
        return new a(0, true);
    }

    protected Object loadEntity(int i8) {
        if (!this.cursor.moveToPosition(i8)) {
            throw new DaoException("Could not move to cursor location " + i8);
        }
        Object loadCurrent = this.daoAccess.loadCurrent(this.cursor, 0, true);
        if (loadCurrent != null) {
            return loadCurrent;
        }
        throw new DaoException("Loading of entity failed (null) at position " + i8);
    }

    public void loadRemaining() {
        checkCached();
        int size = this.entities.size();
        for (int i8 = 0; i8 < size; i8++) {
            get(i8);
        }
    }

    public Object peek(int i8) {
        List<Object> list = this.entities;
        if (list != null) {
            return list.get(i8);
        }
        return null;
    }

    @Override // java.util.List
    public Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.List
    public List<Object> subList(int i8, int i9) {
        checkCached();
        for (int i10 = i8; i10 < i9; i10++) {
            get(i10);
        }
        return this.entities.subList(i8, i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        loadRemaining();
        return this.entities.toArray();
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public d listIterator() {
        return new a(0, false);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return new a(i8, false);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        loadRemaining();
        return (T[]) this.entities.toArray(tArr);
    }
}
